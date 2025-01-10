package pckg_vj3.zd1;

public class WriterAdapter implements WriterInt {

    private OldNovelList oNov;

    public WriterAdapter(OldNovelList on) {
        this.oNov = on;
    }

    @Override
    public void writeNovel(int novelType) {
        if(novelType == (int) novelType) {
            oNov.writeSFNovel();
        } else {
            System.out.println("This can work only for integer as input argument!!!");
        }

    }

}
