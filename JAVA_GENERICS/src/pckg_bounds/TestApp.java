package pckg_bounds;

public class TestApp {

    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3};
        BestUser[] users = {new BestUser("Besty"), new BestUser("Plain"), new BestUser("Bestie")};
        User[] users2 = {new BestUser("Besty"), new BestUser("Plain"), new BestUser("New User")};
        SimpleCls<BestUser> bestUserSimpleCls = new SimpleCls<BestUser>(users);
        bestUserSimpleCls.performSomething();
        SimpleCls<NewUser> newUserSimpleCls = new SimpleCls<>();
        SimpleCls<User> userSimpleCls = new SimpleCls<>(users2);
        System.out.println("--------------------------------------------------");
        userSimpleCls.performSomething();
    }
}
