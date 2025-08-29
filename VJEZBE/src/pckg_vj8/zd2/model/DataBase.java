package pckg_vj8.zd2.model;

import java.util.LinkedList;
import java.util.List;

public class DataBase {
	
	private List<Programmer> programmers;
	
	public DataBase() {
		programmers = new LinkedList<Programmer>();
	}
	
	public void setProgrammer2DB(Programmer programmer) {
		
		programmers.add(programmer);
		
	}
	
	public List<Programmer> getAll4DB(){
		return programmers;
	}

}
