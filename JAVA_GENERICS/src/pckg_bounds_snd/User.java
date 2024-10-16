package pckg_bounds_snd;

public class User implements Comparable<User> {

    private int id;
    private static int cntID = 10;

    private String name;

    public User(String name){
        this.name = name;
        this.id = cntID++;
    }

    public int getId() {
        return id;
    }


    //String length compare
    @Override
    public int compareTo(User other) {
        int res = 0;
        if(this.name.length() > other.name.length()){
            System.out.println("First name is longer than snd name...");
            res = 1;
        }else if (this.name.length() < other.name.length()){
            System.out.println("First name is smaller than snd name...");
            res = -1;
        }else{
            System.out.println("Names length are equal...");
        }
        return res;
    }

    // ID compare
//    @Override
//    public int compareTo(User other) {
//        int res = 0;
//        if (this.id > other.id) {
//            System.out.println("First id is larger than second user id!");
//            res = 1;
//        } else if (this.id < other.id) {
//            System.out.println("First id is smaller than second user id!");
//            res = -1;
//        } else {
//            System.out.println("Both ids are equal!");
//        }
//        return res;
//    }

}
