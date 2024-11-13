package pckg_translate;

public class TestNew {

    public static void main(String[] args) {
        String text = "Ovo je neki tekst koji želimo prevesti na izabrani jezik...";
        TranslatorNew translatorNew = new TranslatorNew();
        translatorNew.setTranslate(new ENGTranslate());
        translatorNew.translatedThisText(text);
        translatorNew.setTranslate(new FRATranslate());
        translatorNew.translatedThisText(text);
    }
}
