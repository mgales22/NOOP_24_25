package pckg_translate;

// Bolja verzija rada koristeci interface Translate uz klase ENGTranslate, FRATranslate
// i TranslatorNew
public class TranslatorNew {
    private Translate translate;

    public void setTranslate(Translate translate){
        this.translate = translate;
    }

    public void translatedThisText(String text){
        translate.translate(text);
    }
}
