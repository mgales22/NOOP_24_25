package pckg_mvc_1.view;

import pckg_mvc_1.model.Programmer;

import java.util.EventObject;

public class FormEvent extends EventObject {
    private Programmer programmer;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, Programmer programmer) {
        super(source);
        this.programmer = programmer;
    }

    public Programmer getProgrammer() {
        return programmer;
    }
}
