package ex_pckg;

public interface ComicReader {
    void goToPage(int numPage) throws PageOutOfRange;
    void next();
    int currentPage();
    void previous();
    void last();
    void first();
    void zoom(int percent);
    void nightReadingMode(boolean status);


    }



