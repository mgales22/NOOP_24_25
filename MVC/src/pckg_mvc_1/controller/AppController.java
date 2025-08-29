package pckg_mvc_1.controller;

import pckg_mvc_1.model.DataBase;
import pckg_mvc_1.model.Programmer;
import pckg_mvc_1.view.ViewPanel;

import java.io.File;
import java.util.List;

public class AppController {

    private DataBase dataBase;

    public AppController() {
        dataBase = new DataBase();
    }

    public void addNewProgrammer2DB(Programmer programmer) {
        dataBase.addProgrammer2DB(programmer);
    }

    public List<Programmer> getAllProgrammers4DB() {
        return dataBase.getAll4DB();
    }

    public void showAllData4DBOnViewPanel(ViewPanel viewPanel){
        viewPanel.showAllDataFromDB(dataBase.getAll4DB());
    }

    public void saveDataBase2File(File file) {
        dataBase.saveData2File(file);
    }

    public void loadDataBase4File(File file) {
        dataBase.loadData4File(file);
    }
}
