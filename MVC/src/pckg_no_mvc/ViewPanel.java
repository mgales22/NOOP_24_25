package pckg_no_mvc;


import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ViewPanel(){
        initAll();
        layoutComps();
    }

    private void layoutComps() {
       add(scrollPane, BorderLayout.CENTER);

    }

    private void initAll() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(690, 250));
    }

    public void appendText(String string) {
        textArea.append(string+"\n");
    }


}
