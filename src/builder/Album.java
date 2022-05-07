package builder;

import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String recordCompany;
    private int year;
    private List<String> authors;
    private List<String> tracks;

    public Album() {
        authors = new LinkedList<String>();
        tracks = new LinkedList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecordCompany() {
        return recordCompany;
    }

    public void setRecordCompany(String recordCompany) {
        this.recordCompany = recordCompany;
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

    public List<String> getTracks() {
        return tracks;
    }

    public void addAlbum(String track) {
        tracks.add(track);
    }

    public void print() {
        System.out.println("Album name: %s".formatted(this.name));
        System.out.println("Record company: %s".formatted(this.recordCompany));
        System.out.println("Year: %s".formatted(this.year));
        System.out.println("Autores: %s".formatted(String.join(", ", this.authors)));
        System.out.println("Tracks:");
        System.out.print("    ");
        System.out.println("%s".formatted(String.join("\n    ", this.tracks)));
        System.out.println("");
    }
}
