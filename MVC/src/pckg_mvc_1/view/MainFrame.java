package pckg_mvc_1.view;

import pckg_mvc_1.controller.AppController;
import pckg_mvc_1.model.Programmer;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;
    private AppController controller;
    private JMenuBar menuBar;
    private JFileChooser fileChooser;

    public MainFrame(){
        super("Simple App");

        initAll();
        layoutComps();
        activateMainFrame();
    }

    private void activateMainFrame() {

        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formEventOccurred(FormEvent fe) {
                Programmer programmer = fe.getProgrammer();
                viewPanel.appendText(programmer.toString());
                controller.addNewProgrammer2DB(programmer);
            }
        });
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
    }

    private void initAll() {

        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
        controller = new AppController();
        menuBar = createMenuBar();
        setJMenuBar(menuBar);
        fileChooser = new JFileChooser("DATA");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("BIN, TXT & CSV files", "bin", "txt", "csv");
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setAcceptAllFileFilterUsed(true);
    }

    private JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem showDataItem = new JMenuItem("Show data from DB");
        JMenuItem exportItem = new JMenuItem("Export data...");
        JMenuItem importItem = new JMenuItem("Import data...");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(showDataItem);
        fileMenu.add(exportItem);
        fileMenu.add(importItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        showDataItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.showAllData4DBOnViewPanel(viewPanel);
            }
        });

        exportItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int val = fileChooser.showSaveDialog(MainFrame.this);
                if(val == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();
                    controller.saveDataBase2File(file);
                }
            }
        });

        importItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int val = fileChooser.showOpenDialog(MainFrame.this);
                if(val == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();
                    controller.loadDataBase4File(file);
                }
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int val = JOptionPane.showConfirmDialog(MainFrame.this, "Do you really want to exit?",
                        "Exit", JOptionPane.OK_CANCEL_OPTION);
                if(val == JOptionPane.OK_OPTION){
                    System.exit(0);
                }
            }
        });

        return menuBar;
    }
}
