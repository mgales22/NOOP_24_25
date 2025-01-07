package pckg_vj2.zd4;

import java.util.ArrayList;
import java.util.List;

public class Developer implements ProjectObserver {
    private String name;
    private String email;
    private List<CodeChange> receivedChanges;

    public Developer(String name, String email) {
        this.name = name;
        this.email = email;
        this.receivedChanges = new ArrayList<>();
    }

    @Override
    public void update(CodeChange change) {
        receivedChanges.add(change);
        System.out.println("\nNotifying developer: " + name);
        System.out.println(change.toString());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void submitChange(OpenSourceProject project, String description, String code) {
        CodeChange change = new CodeChange(description, code, this);
        project.commitChange(change);
    }

    public List<CodeChange> getReceivedChanges() {
        return receivedChanges;
    }
}
