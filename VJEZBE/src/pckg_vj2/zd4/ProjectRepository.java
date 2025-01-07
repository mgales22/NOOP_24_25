package pckg_vj2.zd4;

public interface ProjectRepository {
    void addCollaborator(ProjectObserver collaborator);
    void removeCollaborator(ProjectObserver collaborator);
    void notifyCollaborators(CodeChange change);
}
