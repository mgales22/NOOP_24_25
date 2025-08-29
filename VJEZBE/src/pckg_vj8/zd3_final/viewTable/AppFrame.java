package pckg_vj8.zd3_final.viewTable;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import pckg_vj8.zd3_final.controllerTable.Controller;
import pckg_vj8.zd3_final.modelTable.ExperienceEnum;
import pckg_vj8.zd3_final.modelTable.ProgLangEnum;
import pckg_vj8.zd3_final.modelTable.Programmer;

public class AppFrame extends JFrame {

	private DataPanel dataPanel;
	private PresentationPanel presPanel;
	private Controller controller;
	private JMenuBar menuBar;
	private JFileChooser fileChooser;

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

	private JMenuBar createMenuBar() {

		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu serverMenu = new JMenu("Server");

		JMenuItem saveData = new JMenuItem("Save data in a file...");
		JMenuItem openData = new JMenuItem("Import data from a file...");
		JMenuItem exit = new JMenuItem("Exit app");

		JMenuItem uploadData = new JMenuItem("Save data in a server...");
		JMenuItem downloadData = new JMenuItem("Import data from a server...");
		JMenuItem disconnect = new JMenuItem("Diconnect from a server");

		fileMenu.add(saveData);
		fileMenu.add(openData);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		// exit menu item
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int val = JOptionPane.showConfirmDialog(AppFrame.this, "Do you realy want to exit app", "Exit dialog",
						JOptionPane.OK_CANCEL_OPTION);
				if (val == JOptionPane.OK_OPTION) {
					System.exit(0);
				} else {
					System.out.println("Exit canceled by user...");
				}

			}
		});
		// save data menu item
		saveData.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int val = fileChooser.showSaveDialog(AppFrame.this);

				if (val == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					try {
						controller.saveData2File(file);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(AppFrame.this, "Unable to save data into the file!", "Save error",
								JOptionPane.ERROR_MESSAGE);
					}
				}

			}
		});

		//open menu item
		openData.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int val = fileChooser.showOpenDialog(AppFrame.this);

				if (val == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					try {
						controller.importData4File(file);
						controller.showProgrammerData(presPanel);
						controller.showImportedDataInTxtPanel(presPanel);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(AppFrame.this, "Unable to read data from the file!", "Open error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		serverMenu.add(uploadData);
		serverMenu.add(downloadData);
		serverMenu.addSeparator();
		serverMenu.add(disconnect);
		
		// upload data 2 DB
		uploadData.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					controller.connect2DB();
					controller.save2DB();
					controller.disconnect4DB();
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(AppFrame.this, "Some DB server connection error!!!", "Save DB error",
							JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		downloadData.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					controller.connect2DB();
				} catch (SQLException e3) {
					JOptionPane.showMessageDialog(AppFrame.this, "Unable to connect to a DB server!!!", "Connection DB error",
							JOptionPane.ERROR_MESSAGE);
				}
				try {
					controller.load4DB();
					controller.showImportedDataInTxtPanel(presPanel);
					controller.showProgrammerData(presPanel);
				} catch (SQLException e2) {
					JOptionPane.showMessageDialog(AppFrame.this, "Unable to load data from a DB server!!!", "Load DB error",
							JOptionPane.ERROR_MESSAGE);
				}
				try {
					controller.disconnect4DB();
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(AppFrame.this, "Unable to disconnect from a DB server!!!", "Disconnect DB error",
							JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		disconnect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					controller.disconnect4DB();
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(AppFrame.this, "Unable to disconnect from a DB server!!!", "Disconnect DB error",
							JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});

		mb.add(fileMenu);
		mb.add(serverMenu);

		return mb;
	}

	private void initAll() {
		dataPanel = new DataPanel();
		presPanel = new PresentationPanel();
		controller = new Controller();
		controller.setData4Table(presPanel);
		menuBar = createMenuBar();
		setJMenuBar(menuBar);
		fileChooser = new JFileChooser();
		setFileExtension();
	}
	
	private void setFileExtension() {
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Programmer files (*.prgm)", "prgm");
		fileChooser.setFileFilter(filter);
		fileChooser.setAcceptAllFileFilterUsed(false);
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
				controller.showProgrammerData(presPanel);
			}
		});
	}
}
