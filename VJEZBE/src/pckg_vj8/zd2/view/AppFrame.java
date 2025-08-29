package pckg_vj8.zd2.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import pckg_vj8.zd2.controller.Controller;
import pckg_vj8.zd2.model.ExperienceEnum;
import pckg_vj8.zd2.model.ProgLangEnum;
import pckg_vj8.zd2.model.Programmer;

public class AppFrame extends JFrame {

	private DataPanel dataPanel;
	private PresentationPanel presPanel;
	private Controller controller;

	public AppFrame() {
		super("Simple MVC");
		setLayout(new BorderLayout());
		setSize(550, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		initAll();
		layoutAll();
		activateApp();
	}

	private void layoutAll() {
		add(dataPanel, BorderLayout.SOUTH);
		add(presPanel, BorderLayout.CENTER);

	}

	private void initAll() {
		dataPanel = new DataPanel();
		presPanel = new PresentationPanel();
		controller = new Controller();
	}

	private void activateApp() {

		dataPanel.setDataPanelListener(new DataPanelListener() {

			@Override
			public void dataPanelEventOccured(DataPanelEvent dpe) {
				int id = dpe.getId();
				String name = dpe.getName();
				String sname = dpe.getSname();
				ProgLangEnum prog = dpe.getProg();
				ExperienceEnum exp = dpe.getExp();
				String wrTme = dpe.getWrTme();
				
				Programmer prgm = dataPanel.getProgrammer();
				controller.addNewProgrammer2DB(prgm);
				controller.showOnPresPanel(prgm, presPanel);
			}
		});
	}
}
