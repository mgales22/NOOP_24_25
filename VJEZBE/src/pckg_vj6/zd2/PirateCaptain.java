package pckg_vj6.zd2;

public class PirateCaptain extends Captain {
    public PirateCaptain(String name) {
        this.name = name;
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "PirateCaptain [name=" + name + "]";
    }
}
