package pckg_bounds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleCls <T extends User>{

    private final List<T> users;

    public SimpleCls() {
        this.users = new ArrayList<>();
    }

    public SimpleCls(T[] arrUsers){
        this.users = Arrays.asList(arrUsers);
    }

    public void performSomething(){
        if(users.isEmpty()){
            System.out.println("No users to perform something.");
        }else{
            for(T user : users){
                user.performSomething();
            }
        }
    }
}
