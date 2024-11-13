package pckg_translate;

import javax.management.InvalidAttributeValueException;

public class Translator {

    private int choice;
    private final EnglishTranslator englishTranslator;
    private final FranceTranslator franceTranslator;

    public Translator(){
        System.out.println("CRO to ENG and CRO to FRA translator");
        englishTranslator = new EnglishTranslator();
        franceTranslator = new FranceTranslator();
    }
    public void setChoice(int choice){
        this.choice = choice;
    }

    public void translateThis(String text) throws InvalidAttributeValueException {

        switch(choice){
            case 1: {
                englishTranslator.translateText(text);
            }break;
            case 2: {
                franceTranslator.translate(text);
            }break;

            default: throw new InvalidAttributeValueException("Expected 1 or 2");
        }
    }
}
