package pckg_vj2.zd4;

import java.util.ArrayList;
import java.util.List;

public class OpenSourceProject implements ProjectRepository {
    private String projectName;
    private List<ProjectObserver> collaborators;
    private List<CodeChange> changeHistory;

    public OpenSourceProject(String projectName) {
        this.projectName = projectName;
        this.collaborators = new ArrayList<>();
        this.changeHistory = new ArrayList<>();
    }

    @Override
    public void addCollaborator(ProjectObserver collaborator) {
        if (!collaborators.contains(collaborator)) {
            collaborators.add(collaborator);
            System.out.printf("\n%s joined the project %s\n",
                    collaborator.getName(), projectName);
        }
    }

    @Override
    public void removeCollaborator(ProjectObserver collaborator) {
        if (collaborators.remove(collaborator)) {
            System.out.printf("\n%s left the project %s\n",
                    collaborator.getName(), projectName);
        }
    }

    @Override
    public void notifyCollaborators(CodeChange change) {
        for (ProjectObserver collaborator : collaborators) {
            if (!collaborator.getEmail().equals(change.getAuthor().getEmail())) {
                collaborator.update(change);
            }
        }
    }

    public void commitChange(CodeChange change) {
        changeHistory.add(change);
        notifyCollaborators(change);
    }

    public List<CodeChange> getChangeHistory() {
        return changeHistory;
    }
}
