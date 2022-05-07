package builder;

public class Main {
    public static void createBookTest(CollectionItemBuilder builder) {
        builder.buildItem()
                .setName("The Hobbit")
                .addAuthor("J. R. R. Tolkien")
                .setYear(1937)
                .setPublisher("George Allen & Unwin")
                .addContent("Preface to the Second Edition")
                .addContent("introduction")
                .addContent("1. an unexpected party")
                .addContent("2. roast mutton")
                .addContent("3. a short rest")
                .addContent("4. over hill and under hill")
                .addContent("5. riddles in the dark")
                .addContent("6. out of the frying-pan into the fire")
                .addContent("7. queer lodgings")
                .addContent("8. flies and spiders")
                .addContent("9. barrels out of bond")
                .addContent("10. a warm welcome")
                .addContent("11. on the doorstep")
                .addContent("12. inside information")
                .addContent("13. not at home")
                .addContent("14. fire and water")
                .addContent("15. the gathering of the clouds")
                .addContent("16. a thief in the night")
                .addContent("17. the clouds burst")
                .addContent("18. the return journey")
                .addContent("19. the last stage")
                .addContent("Appendix A. The Quest of Erebor")
                .addContent("Appendix B. The Runes")
                .addContent("Bibliography")
                .addContent("Map of Wilderland");
    }

    public static void createAlbumTest(CollectionItemBuilder builder) {
        builder.buildItem()
                .setName("Yellow Submarine")
                .addAuthor("The Beatles")
                .setYear(1969)
                .setPublisher("Apple Records")
                .addContent("Yellow Submarine")
                .addContent("Only a Northern Song")
                .addContent("All Together Now")
                .addContent("Hey Bulldog")
                .addContent("It's All Too Much")
                .addContent("All You Need Is Love")
                .addContent("Pepperland")
                .addContent("Sea of Time")
                .addContent("Sea of Holes")
                .addContent("Sea of Monsters")
                .addContent("March of the Meanies")
                .addContent("Pepperland Laid Waste")
                .addContent("Yellow Submarine in Pepperland");
    }

    public static void main(String[] args) {
        AlbumCollectionItemBuilder albumBuilder = new AlbumCollectionItemBuilder();
        BookCollectionItemBuilder bookBuilder = new BookCollectionItemBuilder();

        createAlbumTest(albumBuilder);

        Album album = albumBuilder.getAlbum();
        album.print();

        createBookTest(bookBuilder);

        Book book = bookBuilder.getBook();
        book.print();
    }
}
