package pckg_translate;

import javax.management.InvalidAttributeValueException;

public class AppTestTranslator {

    public static void main(String[] args) {
        Translator translator = new Translator();
        try {
            translator.setChoice(2);
            translator.translateThis("Ovo je za prijevod");
        } catch (InvalidAttributeValueException e) {
            System.out.println(e.getMessage());
        }

    }
}
