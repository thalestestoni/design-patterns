package builder;

import java.util.LinkedList;
import java.util.List;

public class Book {
    private String name;
    private String publishingCompany;
    private int year;
    private List<String> authors;
    private List<String> chapters;

    public Book() {
        authors = new LinkedList<String>();
        chapters = new LinkedList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    public List<String> getChapters() {
        return chapters;
    }

    public void addChapter(String chapter) {
        chapters.add(chapter);
    }

    public void print() {
        System.out.println("Book name: %s".formatted(this.name));
        System.out.println("Publishing company: %s".formatted(this.publishingCompany));
        System.out.println("Year: %s".formatted(this.year));
        System.out.println("Autores: %s".formatted(String.join(", ", this.authors)));
        System.out.println("Capitulos:");
        System.out.print("    ");
        System.out.println("%s".formatted(String.join("\n    ", this.chapters)));
        System.out.println("");
    }
}
