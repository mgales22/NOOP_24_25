package pckg_vj6.zd2;

public class CargoCaptain extends Captain {
    public CargoCaptain(String name) {
        this.name = name;
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CargoCaptain [name=" + name + "]";
    }
}
