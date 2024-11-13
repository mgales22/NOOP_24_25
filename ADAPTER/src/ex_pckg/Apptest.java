package ex_pckg;

public class Apptest {
    public static void main(String[] args) {
        Comic comic = new Comic("Captain America", "DT & CH", 100);
        SimpleComicReader comicReader = new SimpleComicReader();
        comicReader.setComic(comic);
        Client client = new Client();
        client.setComicReader(comicReader);
        client.skipToNextPage();
        client.giveMeThisPAge(99);
        client.turnNightModeON();
        Book book = new Book("The last principle", "A.G Matoš", 230);
        FSTBookReader bookReader = new FSTBookReader();
        bookReader.setBook(book);
        BookToComicAdapter adapter = new BookToComicAdapter(bookReader);
        client.setComicReader(adapter);
        client.turnNightModeOFF();


    }
}
