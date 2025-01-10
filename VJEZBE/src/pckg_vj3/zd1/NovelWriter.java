package pckg_vj3.zd1;

public class NovelWriter implements WriterInt {

    private String writer;

    public NovelWriter(String writer) {

        this.writer = writer;
    }

    @Override
    public void writeNovel(int novelType) {

        switch (novelType) {
            case 1:
                System.out.println(writer + " writing a history novel...");
                System.out.println(toString());
                System.out.println("****************************************");
                break;
            case 2:
                System.out.println(writer + " writing a thriler novel...");
                System.out.println(toString());
                System.out.println("****************************************");
                break;
            case 3:
                System.out.println(writer + " writing a romantic novel...");
                System.out.println(toString());
                System.out.println("****************************************");
                break;

            default:
                throw new IllegalArgumentException("Unexpected value for novel type: " + novelType);
        }
    }

    @Override
    public String toString() {
        return "NovelWriter [writer=" + writer + "]";
    }
}
