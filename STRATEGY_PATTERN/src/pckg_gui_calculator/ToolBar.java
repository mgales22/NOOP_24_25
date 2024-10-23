package pckg_gui_calculator;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JPanel {

    private JButton saveAsText;
    private JButton saveObjects;
    private JButton loadText;
    private JButton loadObjects;
    private JButton clearAll;

    public ToolBar(){
        initComps();
        layoutComps();
        activateToolBar();
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

    }
}
