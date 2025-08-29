package pckg_vj8.zd3_final.viewTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import pckg_vj8.zd3_final.modelTable.DataBase;
import pckg_vj8.zd3_final.modelTable.Programmer;

public class PresentationPanel extends JPanel {
	
	private JTextPane txtPane;
	private JScrollPane scPanel;
	private StyledDocument doc;
	private SimpleAttributeSet attributes;
	private JTable table;
	private List<Programmer> programmers;
	private JScrollPane scTablePanel;
	private AbstractTableModel tabModel;
	
	
	public PresentationPanel() {
		
		setLayout(new BorderLayout());
		initAll();
		add(scTablePanel, BorderLayout.CENTER);
		add(scPanel, BorderLayout.SOUTH);
	}
	
	public void setDBData(DataBase db) {
		programmers = db.getAll4DB();
	}
	
	private void initAll() {
		txtPane = new JTextPane();
		txtPane.setEditable(false);
		doc = txtPane.getStyledDocument();
		txtPane.setBackground(Color.GRAY);
		Color fontclr = new Color(50, 15, 130);
		txtPane.setForeground(fontclr);
		Dimension tdim = txtPane.getPreferredSize();
		tdim.height = 155;
		txtPane.setPreferredSize(tdim);
		attributes = new SimpleAttributeSet();
		StyleConstants.setFontFamily(attributes, "Consolas");
		StyleConstants.setFontSize(attributes, 14);
	    attributes.addAttribute(StyleConstants.CharacterConstants.Bold, Boolean.TRUE);
		scPanel = new JScrollPane(txtPane, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.table = setTable();
		scTablePanel = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	}
	
	private JTable setTable() {
		
		JTable table = new JTable();
		
			tabModel = new AbstractTableModel() {
			
			String[] colNames = {"id", "name", "surname", "programming in", "experience", "working time"};
			
			
			
			@Override
			public String getColumnName(int column) {
				return colNames[column];
			}

			@Override
			public Object getValueAt(int row, int col) {
				
				Programmer programmer = programmers.get(row);
				switch (col) {
				case 0: return programmer.getId();
				case 1: return programmer.getName();
				case 2: return programmer.getSname();
				case 3: return programmer.getProg();
				case 4: return programmer.getExp();
				case 5: return programmer.getWrTme();

				default:
					throw new IllegalArgumentException("There is no such value for the input data!!!");
				}
			}
			
			@Override
			public int getRowCount() {
				return programmers.size();
			}
			
			@Override
			public int getColumnCount() {
				Programmer prgm = new Programmer();
				return prgm.getClass().getDeclaredFields().length-1;
			}
		};
		
		table.setModel(tabModel);
		return table;
	}
	
	
	public void showOnPresPanel(Programmer programmer) {
		try {
			doc.insertString(doc.getLength(), programmer.toString() +"\n\n", attributes);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void showDataOnTable() {
		tabModel.fireTableDataChanged();
	}

	public void showImportedDataInTxtPanel(List<Programmer> all4db) {
		for(Programmer prg : all4db) {
			showOnPresPanel(prg);
		}
		
	}
	
}
