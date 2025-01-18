package pckg_vj6.zd2;

public class CruiserCaptain extends Captain {
    public CruiserCaptain(String name) {
        this.name = name;
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CruiserCaptain [name=" + name + "]";
    }
}
