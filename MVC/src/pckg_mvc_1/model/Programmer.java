package pckg_mvc_1.model;

import java.io.Serializable;

public class Programmer implements Serializable {

    private int id;
    private static int cntID = 1;

    private String name;
    private String email;

    private String programmingLanguage;

    private String experience;

    private String workingTime;


    public Programmer(String name, String email, String programmingLanguage, String experience, String workingTime) {
        this.id = cntID++;
        this.name = name;
        this.email = email;
        this.programmingLanguage = programmingLanguage;
        this.experience = experience;
        this.workingTime = workingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", experience='" + experience + '\'' +
                ", workingTime='" + workingTime + '\'' +
                '}';
    }
}
