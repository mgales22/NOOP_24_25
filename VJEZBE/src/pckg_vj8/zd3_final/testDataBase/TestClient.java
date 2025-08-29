package pckg_vj8.zd3_final.testDataBase;

import java.sql.SQLException;

import pckg_vj8.zd3_final.modelTable.DataBase;
import pckg_vj8.zd3_final.modelTable.ExperienceEnum;
import pckg_vj8.zd3_final.modelTable.ProgLangEnum;
import pckg_vj8.zd3_final.modelTable.Programmer;

public class TestClient {
	
	public static void main(String[] args) {
		
		DataBase db = new DataBase();
		Programmer prog1 = new Programmer("Mark", "Lang", ProgLangEnum.Python, ExperienceEnum.five2Ten, "Full time");
		Programmer prog2 = new Programmer("Stephany", "Expert", ProgLangEnum.Ruby, ExperienceEnum.lessFive, "Part time");
		db.setProgrammer2DB(prog1);
		db.setProgrammer2DB(prog2);
		
		try {
			db.connect();
			db.save2DB();
			db.load4DataBase();
			db.listAll4DB();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			db.disconnect();
			System.out.println("Disconnected!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
