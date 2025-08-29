package pckg_vj8.zd3_final.modelTable;

import java.io.Serializable;

public class Programmer implements Serializable {

	private static int cnt = 10;
	private int id;
	private String name;
	private String sname;
	private ProgLangEnum prog;
	private ExperienceEnum exp;
	private String wrTme;
	
	
	public Programmer() {
		// TODO Auto-generated constructor stub
	}

	public Programmer(String name, String sname, ProgLangEnum prog, ExperienceEnum exp, String time) {

		this.id = cnt;
		this.name = name;
		this.sname = sname;
		this.prog = prog;
		this.exp = exp;
		this.wrTme = time;
		cnt++;
	}

	public Programmer(int id, String name, String sname,ProgLangEnum prog, ExperienceEnum exp, String time) {
		this.id = id;
		this.name = name;
		this.sname = sname;
		this.prog = prog;
		this.exp = exp;
		this.wrTme = time;
		cnt = id+1;
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

	@Override
	public String toString() {
		return "Programmer [id=" + id + ", name=" + name + ", sname=" + sname + ", prog=" + prog + ", exp=" + exp
				+ ", wrTme=" + wrTme + "]";
	}

	public void description() {
		System.out.println(toString());
	}

	public static void setCounter(int i) {
		cnt = i;
		
	}
}
