package pckg_bounds_snd;

public class TestApp {

    public static void main(String[] args) {
        String fst = "Some simple sting";
        String snd = "This one is the second one, and it is a bit longer...";

        CompareTWO<String> compareStrings = new CompareTWO(fst, snd);
        compareStrings.compareTwo();

        Integer fstInt = 120;
        Integer sndInt = 45;

        CompareTWO<Integer> compareInts = new CompareTWO(fstInt, sndInt);
        compareInts.compareTwo();

        User user1 = new User("Ivana Petra");
        User user2 = new User("Petra");

        CompareTWO<User> compareUsers = new CompareTWO(user1, user2);
        compareUsers.compareTwo();
    }
}
