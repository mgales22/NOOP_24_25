package pckg_vj8.zd3_final.modelTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataBase {
	
	private List<Programmer> programmers;
	private Connection con;
	
	public DataBase() {
		programmers = new LinkedList<Programmer>();
		con = null;
	}
	
	public void setProgrammer2DB(Programmer programmer) {
		
		programmers.add(programmer);
		
	}
	
	public List<Programmer> getAll4DB(){
		return programmers;
	}
	
	public void saveDB2File(File file) throws IOException {
		
		Programmer[] prgms = programmers.toArray(new Programmer[programmers.size()]);
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(prgms); // need to be Serializable base Class Programmer
		oos.close();
	}
	
	public void readData4File(File file) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			Programmer[] prgms = (Programmer[]) ois.readObject();
			programmers.clear();
			programmers.addAll(Arrays.asList(prgms));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ois.close();
	}
	
	public void connect() throws SQLException {
		System.out.println("Connecting to database...");

		try {
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// obtain connection
			String url = "jdbc:mysql://db4free.net:3306/database"; // your database
			String user = "username"; // your user name
			String password = "passwd"; // your password 
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to -> " + con.toString());
		} catch (ClassNotFoundException e) {
			System.out.println("Could not load driver!!!");
		}
		
	}
	
	public void disconnect() throws SQLException {
		con.close();
		System.out.println("Disconnected from DB....");
	}
	
	public void save2DB() throws SQLException {
		
		// assume that connection is successfully established
		if(con != null) {
			// SQL queries
			String cntSql = "select count(*) as count from newProgrammerTable where id = ?";
			String insSql = "insert into newProgrammerTable (id, name, surname, programming, experience, workingTime) values (?,?,?,?,?,?)";
			String updSql = "update newProgrammerTable set name = ?, surname = ?, programming = ?, experience = ?, workingTime = ? where id = ?";
			// statements
			PreparedStatement cntStm = con.prepareStatement(cntSql);
			PreparedStatement insrStm = con.prepareStatement(insSql);
			PreparedStatement updStm = con.prepareStatement(updSql);
			
			// checking all programmers
			for(Programmer prg: programmers) {
				int id = prg.getId();
				String name = prg.getName();
				String sname = prg.getSname();
				ProgLangEnum prog = prg.getProg();
				ExperienceEnum exp = prg.getExp();
				String time = prg.getWrTme();
				
				cntStm.setInt(1, id);
				ResultSet result = cntStm.executeQuery();
				result.next();
				
				int cnt = result.getInt(1);
				System.out.println("Cnt -> " + cnt);
				
				if(cnt == 0) {
					System.out.println("Inserting new programmer -> " + id);
					// insert commands
					int col = 1;
					insrStm.setInt(col++, id);
					insrStm.setString(col++, name);
					insrStm.setString(col++, sname);
					insrStm.setString(col++, prog.name());
					insrStm.setString(col++, exp.name());
					insrStm.setString(col++, time);
					
					insrStm.executeUpdate();
					
				} else {
					System.out.println("Updating programmer -> " + id);
					// update commands
					int col = 1;
					updStm.setString(col++, name);
					updStm.setString(col++, sname);
					updStm.setString(col++, prog.name());
					updStm.setString(col++, exp.name());
					updStm.setString(col++, time);
					updStm.setInt(col++, id);
					
					updStm.executeUpdate();
				}
			}
			
			cntStm.close();
			insrStm.close();
			updStm.close();


		}
		
	}
	
	public void load4DataBase() throws SQLException {
		if(con != null) {
			System.out.println("Loading from DB...");
			String slctSQL = "select id, name, surname, programming, experience, workingTime from newProgrammerTable order by name ";
			PreparedStatement slcStm = con.prepareStatement(slctSQL);
			
			ResultSet slcResult = slcStm.executeQuery();
			programmers.clear();
			while(slcResult.next()) {
				int id = slcResult.getInt(1);
				String name = slcResult.getString(2);
				String sname = slcResult.getString(3);
				ProgLangEnum prog = ProgLangEnum.valueOf(slcResult.getString(4));
				ExperienceEnum exp = ExperienceEnum.valueOf(slcResult.getString(5));
				String time = slcResult.getString(6);
				Programmer programmer = new Programmer(id, name, sname, prog, exp, time);
				programmers.add(programmer);
			}
			
			slcResult.close();
			slcStm.close();
		}
	}
	
	public void listAll4DB() {
		System.out.println("<<<<<<<<<<<<< Listing all from DB >>>>>>>>>>>>>");
		for(Programmer prog : programmers) {
			prog.description();
		}
	}

}
