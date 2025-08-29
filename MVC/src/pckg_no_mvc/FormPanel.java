package pckg_no_mvc;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {

    private JTextField nameField;
    private  JTextField emailField;

    private JComboBox<String> programmingLangCombo;
    private JList<String> experienceList;

    private JRadioButton fullTimeRadio;
    private JRadioButton partTimeRadio;

    private ButtonGroup workingTimeGroup;

    private JButton submitBtn;

    private JScrollPane expListScroll;

    private FormPanelListener formListener;
    public FormPanel(){
        initAll();
        layoutComps();
        activatePanel();
    }

    private void activatePanel() {

       submitBtn.addActionListener(e -> {
           String name = nameField.getText();
           String email = emailField.getText();
           String programmingLang = (String) programmingLangCombo.getSelectedItem();
           String experience = experienceList.getSelectedValue();
           String workingTime = workingTimeGroup.getSelection().getActionCommand();

           Programmer programmer = new Programmer(name, email, programmingLang, experience, workingTime);
           FormEvent fev = new FormEvent(this, programmer);
           System.out.println(programmer);
           if(formListener != null){
               formListener.formEventOccurred(fev);
           }
              resetForm();
       });
    }

    private void layoutComps() {

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;


        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Name: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Email: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(emailField, gbc);

        gbc.gridx++;
        gbc.gridy = 0;

        add(Box.createHorizontalStrut(40), gbc);

        gbc.gridx++;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;

        add(new JLabel("Programming language: "), gbc);

        gbc.gridy++;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(programmingLangCombo, gbc);

        gbc.gridx++;
        gbc.gridy = 0;

        add(Box.createHorizontalStrut(40), gbc);

        gbc.gridx++;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;

        add(new JLabel("Experience: "), gbc);

        gbc.gridy++;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(expListScroll, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;

        add(Box.createVerticalStrut(40), gbc);

        gbc.gridy++;

        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Working time: "), gbc);

        gbc.gridx++;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(fullTimeRadio, gbc);

        gbc.gridy++;
        add(partTimeRadio, gbc);

        gbc.gridx= 5;

        add(submitBtn, gbc);


    }

    private void initAll() {

        Border innerBorder = BorderFactory.createTitledBorder("Programmer data");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        nameField = new JTextField(10);
        emailField = new JTextField(10);
        programmingLangCombo = new JComboBox<>();
        experienceList = new JList<>();
        fullTimeRadio = new JRadioButton("Full time");
        fullTimeRadio.setSelected(true);
        partTimeRadio = new JRadioButton("Part time");

        fullTimeRadio.setActionCommand("Full time");
        partTimeRadio.setActionCommand("Part time");

        workingTimeGroup = new ButtonGroup();
        workingTimeGroup.add(fullTimeRadio);
        workingTimeGroup.add(partTimeRadio);

        DefaultComboBoxModel<String> langModel = new DefaultComboBoxModel<>();
        langModel.addElement("");
        langModel.addElement("Java");
        langModel.addElement("C#");
        langModel.addElement("C++");
        langModel.addElement("Python");
        langModel.addElement("JavaScript");
        langModel.addElement("PHP");

        Dimension combDims = programmingLangCombo.getPreferredSize();
        combDims.width = 150;
        programmingLangCombo.setPreferredSize(combDims);
        programmingLangCombo.setModel(langModel);
        programmingLangCombo.setSelectedIndex(1);


        DefaultListModel<String> expModel = new DefaultListModel<>();
        expModel.addElement("1 year");
        expModel.addElement("2 years");
        expModel.addElement("3 years");
        expModel.addElement("4 years");
        expModel.addElement("5  or more years");
        experienceList.setModel(expModel);
        experienceList.setSelectedIndex(0);
        experienceList.setVisibleRowCount(3);

        expListScroll = new JScrollPane(experienceList);
        expListScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        Border expListBorder = BorderFactory.createEtchedBorder();
        expListScroll.setBorder(expListBorder);

        submitBtn = new JButton("Submit data");
    }

    public void setFormPanelListener(FormPanelListener listener){
        this.formListener = listener;
    }

    private void resetForm(){
        nameField.setText("");
        emailField.setText("");
        programmingLangCombo.setSelectedIndex(0);
        experienceList.setSelectedIndex(0);
        fullTimeRadio.setSelected(true);
    }

}
