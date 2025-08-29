package pckg_vj8.zd3_final.viewTable;

import java.util.EventObject;

import pckg_vj8.zd3_final.modelTable.ExperienceEnum;
import pckg_vj8.zd3_final.modelTable.ProgLangEnum;
import pckg_vj8.zd3_final.modelTable.Programmer;

public class DataPanelEvent extends EventObject {
	
	private int id;
	private String name;
	private String sname;
	private ProgLangEnum prog;
	private ExperienceEnum exp;
	private String wrTme;

	public DataPanelEvent(Object source, Programmer prgm) {
		super(source);
		
		id = prgm.getId();
		name = prgm.getName();
		sname = prgm.getSname();
		prog = prgm.getProg();
		exp = prgm.getExp();
		wrTme = prgm.getWrTme();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSname() {
		return sname;
	}

	public ProgLangEnum getProg() {
		return prog;
	}

	public ExperienceEnum getExp() {
		return exp;
	}

	public String getWrTme() {
		return wrTme;
	}
	

}
