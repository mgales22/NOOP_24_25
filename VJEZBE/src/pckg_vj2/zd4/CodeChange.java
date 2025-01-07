package pckg_vj2.zd4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CodeChange {
    private String description;
    private String codeSnippet;
    private LocalDateTime timestamp;
    private Developer author;

    public CodeChange(String description, String codeSnippet, Developer author) {
        this.description = description;
        this.codeSnippet = codeSnippet;
        this.timestamp = LocalDateTime.now();
        this.author = author;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm:ss");
        return "Author: " + author.getName() +
                "\nTime: " + timestamp.format(formatter) +
                "\nDescription: " + description +
                "\nCode:\n" + codeSnippet + "\n";
    }

    public Developer getAuthor() {
        return author;
    }
}
