package pckg_intro;

import java.util.HashMap;

public class AppTest {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<User, String> mapUsrStr = new HashMap<>();
        mapUsrStr.put(new User("ime1"), "opis neki");
        mapUsrStr.put(new User("ime2"), "novi opis");
        map.put(5, "pet");
        map.put(10, "deset");
        AUX_CLS.listMapElements(map);
        AUX_CLS.listMapElements(mapUsrStr);
    }
}
