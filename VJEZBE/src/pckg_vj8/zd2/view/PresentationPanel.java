package pckg_vj8.zd2.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import pckg_vj8.zd2.model.Programmer;

public class PresentationPanel extends JPanel {
	
	private JTextPane txtPane;
	private JScrollPane scPanel;
	private StyledDocument doc;
	private SimpleAttributeSet attributes;
	
	
	public PresentationPanel() {
		
		setLayout(new BorderLayout());
		initAll();
		add(scPanel, BorderLayout.CENTER);
	}
	
	private void initAll() {
		txtPane = new JTextPane();
		txtPane.setEditable(false);
		doc = txtPane.getStyledDocument();
		txtPane.setBackground(Color.GRAY);
		Color fontclr = new Color(50, 15, 130);
		txtPane.setForeground(fontclr);
		attributes = new SimpleAttributeSet();
		StyleConstants.setFontFamily(attributes, "Consolas");
		StyleConstants.setFontSize(attributes, 14);
	    attributes.addAttribute(StyleConstants.CharacterConstants.Bold, Boolean.TRUE);
		scPanel = new JScrollPane(txtPane, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	}
	
	public void showOnPresPanel(Programmer programmer) {
		try {
			doc.insertString(doc.getLength(), programmer.toString() +"\n\n", attributes);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
