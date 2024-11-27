package pckg_arrayList_command_problem;

public interface CommandOnList<E> {
    void runCommand();
    void undoCommand();
}
