package pckg_intro;

public class User{

    private int id;
    private static int cntID = 100;
    private String name;

    public User(String name){
        this.name = name;
        id = cntID++;
    }

    public User(String name, int id){
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
