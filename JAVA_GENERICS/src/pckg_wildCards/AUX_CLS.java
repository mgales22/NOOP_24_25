package pckg_wildCards;

import java.util.List;

public class AUX_CLS {

    public static void processNamesInList(List<? extends UserSnd> lst){
        for(UserSnd user: lst){
            System.out.println("Name is: " + user.getName());
        }
    }

    //WRITE NE VRIJEDI (READ GORE VRIJEDI) (?)
//    public static void addSomeUser(List<? extends UserSnd> lst , UserSnd user){
//        lst.add(user);
//    }

    // KADA JE SUPER A NE EXTENDS, ADD OPCIJA JE DOZVOLJENA!
    public static void addNewUser(List<? super UserSnd> users){
        users.add(new UserSnd("Ime"));
    }

    // KONZISTENTNOST PODATAKA U LISTI DOBIVAMO PARAMETRIZIRANJEM NA SLJEDECI NACIN:
    public static <T extends UserSnd> void processList(List<T> lst, T newElement){
        for(T element : lst){
            System.out.println(element);
        }
        lst.add(newElement);
    }
}
