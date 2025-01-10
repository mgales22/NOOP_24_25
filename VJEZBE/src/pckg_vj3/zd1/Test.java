package pckg_vj3.zd1;

public class Test {

    public static void main(String[] args) {
        NovelWriter nw = new NovelWriter("Famous novel writer");
        nw.writeNovel(1);
        nw.writeNovel(3);
        WriterAdapter wa = new WriterAdapter(new OldNovelList("SF novel writer"));
        wa.writeNovel(10);
    }
}
