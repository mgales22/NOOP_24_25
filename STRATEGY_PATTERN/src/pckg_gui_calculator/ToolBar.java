package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {

    private JButton saveAsText;
    private JButton saveObjects;
    private JButton loadText;
    private JButton loadObjects;
    private JButton clearAll;
    private ToolBarListener toolBarListener;

    public ToolBar(){
        initComps();
        layoutComps();
        activateToolBar();
    }

    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }

    private void initComps() {
        this.saveAsText = new JButton("Save as text");
        this.saveObjects = new JButton("Save bin");
        this.loadObjects = new JButton("Load bin");
        this.loadText = new JButton("Load text");
        this.clearAll = new JButton("Clear all");
    }

    private void layoutComps() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(saveAsText);
        add(saveObjects);
        add(loadObjects);
        add(loadText);
        add(clearAll);
    }

    private void activateToolBar() {
        saveAsText.addActionListener(this);
        saveAsText.setActionCommand("saveAsText");
        saveObjects.addActionListener(this);
        saveObjects.setActionCommand("saveObjects");
        loadObjects.addActionListener(this);
        loadObjects.setActionCommand("loadObjects");
        loadText.addActionListener(this);
        loadText.setActionCommand("loadText");
        clearAll.addActionListener(this);
        clearAll.setActionCommand("clearAll");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == saveAsText){
            System.out.println("Clicked: " + saveAsText.getActionCommand());
            if(toolBarListener != null){
                toolBarListener.toolBarEventOccured(saveAsText.getActionCommand());
            }
        }
        if(ae.getSource() == saveObjects){
            System.out.println("Clicked: " + saveObjects.getActionCommand());
        }
        if(ae.getSource() == loadObjects){
            System.out.println("Clicked: " + loadObjects.getActionCommand());
        }
        if(ae.getSource() == loadText){
            System.out.println("Clicked: " + loadText.getActionCommand());
            if(toolBarListener != null){
                toolBarListener.toolBarEventOccured(loadText.getActionCommand());
            }
        if(ae.getSource() == clearAll){
            System.out.println("Clicked: " + clearAll.getActionCommand());
            if(toolBarListener != null){
                toolBarListener.toolBarEventOccured(clearAll.getActionCommand());
            }
        }
    }
}
}

