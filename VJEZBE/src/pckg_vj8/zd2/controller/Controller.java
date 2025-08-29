package pckg_vj8.zd2.controller;

import java.util.List;

import pckg_vj8.zd2.model.DataBase;
import pckg_vj8.zd2.model.Programmer;
import pckg_vj8.zd2.view.PresentationPanel;


public class Controller {
	
	private DataBase db;
	
	public Controller() {
		db = new DataBase();
	}
	
	public void addNewProgrammer2DB(Programmer programmer) {
		db.setProgrammer2DB(programmer);
	}
	
	public List<Programmer> getAllProgrammers(){
		return db.getAll4DB();
	}
	
	public void showOnPresPanel(Programmer prgm, PresentationPanel presPanel) {
		presPanel.showOnPresPanel(prgm);
	}

}
