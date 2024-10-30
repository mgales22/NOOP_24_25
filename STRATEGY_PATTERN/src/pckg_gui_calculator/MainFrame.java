package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;
    private ToolBar toolBar;
    private final List<String> txtData;

    public MainFrame(){

        super("Simple Calculator");
        this.txtData = new ArrayList<>();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(680, 570);
        setVisible(true);

        initComps();
        layoutComps();
        activateMainFrame();
    }

    private void activateMainFrame() {
        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccured(CalculationFormData formRecord) {
                viewPanel.addTextToViewPanel(formRecord);
                txtData.add(formRecord.toString());
            }
        });

        toolBar.setToolBarListener(new ToolBarListener() {
            @Override
            public void toolBarEventOccured(String buttonActionString) {
                if (buttonActionString.equals("saveAsText")) {
                    SaveTxtStrategy saveTxtStrategy = new SaveTxtStrategy();
                    //OVO JE HARD CODING; ZA DOMA POMOCU JFILE CHOOSERA...
                    saveTxtStrategy.saveDataToFile("dataTxt.txt", txtData);
                }
                if(buttonActionString.equals("clearAll")){
                    viewPanel.clearViewPanel();
                    txtData.clear();
                    JOptionPane.showMessageDialog(MainFrame.this, "All data cleared!", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
                if(buttonActionString.equals("loadText")){
                    LoadTxtStrategy loadTxtStrategy = new LoadTxtStrategy();
                    List<String> loaded = loadTxtStrategy.loadDataFromFile("dataTxt.txt");
                    for(String element : loaded){
                        viewPanel.addTextToViewPanel(element);
                    }
                    txtData.addAll(loaded);
                }
            }
        });
    }

    private void layoutComps() {

        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.NORTH);
    }

    private void initComps() {
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
        toolBar = new ToolBar();
    }

}
