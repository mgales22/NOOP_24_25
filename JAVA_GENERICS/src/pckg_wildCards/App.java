package pckg_wildCards;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1,2,3);
        MultiListCLS<Integer> multiFST = new MultiListCLS<>(ints);
        List<Integer> sndInts = List.of(23,24,25,26,27,28,29,30);
        multiFST.compareToList(sndInts);
    }
}
