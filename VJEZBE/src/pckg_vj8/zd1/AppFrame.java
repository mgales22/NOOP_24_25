package pckg_vj8.zd1;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class AppFrame extends JFrame {

	private DataPanel dataPanel;
	private PresentationPanel presPanel;

	public AppFrame() {
		super("Simple application");
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
				presPanel.showOnPresPanel(dataPanel.getProgrammer());
			}
		});
	}
}
