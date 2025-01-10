package pckg_vj3.zd1;

public class OldNovelList {

    private String name;

    public OldNovelList(String writer) {
        name = writer;
    }


    public void writeSFNovel() {
        System.out.println(name + " writing a SF novel...");
        System.out.println(toString());
        System.out.println("****************************************");
    }

    @Override
    public String toString() {
        return "OldNovelist [name=" + name + "]";
    }

}
