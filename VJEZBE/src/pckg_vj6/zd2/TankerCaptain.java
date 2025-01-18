package pckg_vj6.zd2;

public class TankerCaptain extends Captain {
    public TankerCaptain(String name) {
        this.name = name;
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TankerCaptain [name=" + name + "]";
    }
}
