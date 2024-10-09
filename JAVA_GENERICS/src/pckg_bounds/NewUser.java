package pckg_bounds;

public class NewUser extends User{
    protected NewUser(String name) {
        super(name);
    }

    @Override
    public void performSomething() {
        super.performSomething();
        System.out.println("This one can perform something additional in new way - " + getClass().getSimpleName());
    }
}
