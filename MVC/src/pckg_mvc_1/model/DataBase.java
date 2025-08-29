package pckg_mvc_1.model;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase{
    private List<Programmer> programmers;

    public DataBase(){
        programmers = new ArrayList<>();
    }
    public void addProgrammer2DB(Programmer programmer){
        if(programmer != null){
            if(!programmers.contains(programmer)){
                programmers.add(programmer);
                System.out.println("New programmer added to DB!");
            }else{
                JOptionPane.showMessageDialog(null, "Programmer already exists in DB!");
            }
        }else{
            throw new NullPointerException("Programmer object is null!");
        }
    }

    public List<Programmer> getAll4DB(){
        if(programmers.isEmpty()){

        } else{
            System.out.println("Providing data from DB!");
        }
        return programmers;
    }

    public void saveData2File(File file) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(programmers);
            System.out.println("Data saved to file!");
        } catch (FileNotFoundException fe){
            JOptionPane.showMessageDialog(null, "File not found!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving data to file!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void loadData4File(File file) {
        programmers.clear();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            programmers =(List<Programmer>)ois.readObject();
        }
        catch (FileNotFoundException fe){
            JOptionPane.showMessageDialog(null, "Can not acess file!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading data from file!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Have not class definition!",
                    "Error class", JOptionPane.ERROR_MESSAGE);
        }
    }
}
