package pckg_vj8.zd1;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class DataPanel extends JPanel {

	private JTextField nameField;
	private JTextField snameField;
	private JComboBox<ProgLangEnum> progCombo;
	private JList<ExperienceEnum> expList;
	private JRadioButton fullTmeRadio;
	private JRadioButton partTmeRadio;
	private ButtonGroup wrTimeRadios;
	private JButton sbmtBtn;
	private JScrollPane listScroll;
	private DataPanelListener dpl;
	private Programmer programmer;

	public DataPanel() {

		Dimension dim = getPreferredSize();
		dim.height = 210;
		setPreferredSize(dim);
		setBorders2Panel();
		initAll();
		layoutComps();
		activateDataPanel();
	}
	
	public void setDataPanelListener(DataPanelListener lst) {
		this.dpl = lst;
	}

	private void initAll() {

		nameField = new JTextField(10);
		snameField = new JTextField(10);
		progCombo = new JComboBox<>();
		expList = new JList<>();
		fullTmeRadio = new JRadioButton("Full time");
		partTmeRadio = new JRadioButton("Part time");
		wrTimeRadios = new ButtonGroup();

		DefaultComboBoxModel<ProgLangEnum> progModel = new DefaultComboBoxModel<>();
		ProgLangEnum[] arProg = ProgLangEnum.values();
		List<ProgLangEnum> collProg = Arrays.asList(arProg);
		progModel.addAll(collProg);
		progCombo.setModel(progModel);
		progCombo.setSelectedIndex(0);
		Dimension dms = progCombo.getPreferredSize();
		dms.width = 110;
		progCombo.setPreferredSize(dms);

		DefaultListModel<ExperienceEnum> exModel = new DefaultListModel<>();
		ExperienceEnum[] arExp = ExperienceEnum.values();
		List<ExperienceEnum> collExp = Arrays.asList(arExp);
		exModel.addAll(collExp);
		expList.setModel(exModel);
		expList.setVisibleRowCount(3);
		expList.setBorder(BorderFactory.createEtchedBorder());
		Dimension dm = expList.getPreferredSize();
		dm.width = 110;
		expList.setPreferredSize(dm);
		listScroll = new JScrollPane(expList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		fullTmeRadio.setSelected(true);
		wrTimeRadios.add(fullTmeRadio);
		wrTimeRadios.add(partTmeRadio);
		fullTmeRadio.setActionCommand("Full time");
		partTmeRadio.setActionCommand("Part time");

		sbmtBtn = new JButton("Submit data");
	}

	private void setBorders2Panel() {
		Border inner = BorderFactory.createTitledBorder("Data");
		Border outter = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border brd = BorderFactory.createCompoundBorder(outter, inner);
		setBorder(brd);
	}

	private void activateDataPanel() {

		sbmtBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				
				if(dpl != null) {
					programmer = new Programmer(nameField.getText(), snameField.getText(), (ProgLangEnum) progCombo.getSelectedItem(),
							expList.getSelectedValue(), wrTimeRadios.getSelection().getActionCommand());
					DataPanelEvent dpe = new DataPanelEvent(DataPanel.this, programmer);
					dpl.dataPanelEventOccured(dpe);
					programmer.description();
				}

				resetDataPanel();

			}
		});
	}
	
	public Programmer getProgrammer() {
		return programmer;
	}
	
	private void resetDataPanel() {
		nameField.setText("");
		snameField.setText("");
		nameField.requestFocus();
		progCombo.setSelectedIndex(0);
		expList.setSelectedIndex(0);
		fullTmeRadio.setSelected(true);
	}

	private void layoutComps() {

		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		Insets dfltInst = new Insets(0, 0, 0, 0);

		gbc.weightx = 0;
		gbc.weighty = 0;

		gbc.gridx = 0;
		gbc.gridy = 0;

		add(Box.createVerticalStrut(8), gbc);

		gbc.weightx = 0;
		gbc.weighty = 0.1;

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(0, 0, 0, 5);
		add(new JLabel("Name: "), gbc);

		gbc.gridx = 1;
		gbc.insets = dfltInst;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(nameField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(0, 0, 0, 5);
		add(new JLabel("Surname: "), gbc);

		gbc.gridx = 1;
		gbc.insets = dfltInst;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(snameField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(0, 0, 0, 5);
		add(new JLabel("Can work: "), gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.LAST_LINE_START;
		add(fullTmeRadio, gbc);
		gbc.gridy = 4;
		add(partTmeRadio, gbc);

		gbc.gridx = 3;
		Component bx = Box.createHorizontalStrut(25);
		add(bx, gbc);

		gbc.gridx = 4;
		gbc.gridy = 1;

		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(0, 0, 0, 5);
		add(new JLabel("Programming in: "), gbc);

		gbc.gridy = 2;
		gbc.insets = dfltInst;
		add(progCombo, gbc);

		gbc.gridx = 5;
		Component bx2 = Box.createHorizontalStrut(25);
		add(bx2, gbc);

		gbc.gridx = 6;
		gbc.gridy = 1;

		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(0, 0, 0, 5);
		add(new JLabel("Working experience: "), gbc);

		gbc.gridy = 2;
		gbc.insets = dfltInst;
		add(listScroll, gbc);


		gbc.weighty = 0.25;
		gbc.gridx = 6;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.CENTER;
		add(sbmtBtn, gbc);
	}

}
