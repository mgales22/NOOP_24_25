package pckg_vj2.zd4;

public class TestApp {
    public static void main(String[] args) {
        OpenSourceProject project = new OpenSourceProject("Super Cool Project");

        Developer dev1 = new Developer("Ana Anić", "ana@email.com");
        Developer dev2 = new Developer("Pero Perić", "pero@email.com");
        Developer dev3 = new Developer("Ivan Ivić", "ivan@email.com");

        project.addCollaborator(dev1);
        project.addCollaborator(dev2);
        project.addCollaborator(dev3);

        dev1.submitChange(project,
                "Added new login functionality",
                """
                public class LoginService {
                    public void login(String username, String password) {
                        // Implementation
                    }
                }""");

        project.removeCollaborator(dev2);

        dev3.submitChange(project,
                "Fixed password validation",
                """
                public class PasswordValidator {
                    public boolean isValid(String password) {
                        return password.length() >= 8;
                    }
                }""");

        project.addCollaborator(dev2);

        dev1.submitChange(project,
                "Added password hashing",
                """
                public class PasswordHasher {
                    public String hashPassword(String password) {
                        // Implementation
                        return hashedPassword;
                    }
                }""");

        System.out.println("\n=== Project Change History ===");
        for (CodeChange change : project.getChangeHistory()) {
            System.out.println(change);
        }
    }
}
