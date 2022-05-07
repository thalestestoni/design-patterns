package builder;

public class BookCollectionItemBuilder implements CollectionItemBuilder {
    private Book book;

    public BookCollectionItemBuilder() {
        this.book = new Book();
    }

    public Book getBook() {
        return this.book;
    }

    @Override
    public CollectionItemBuilder buildItem() {
        return this;
    }

    @Override
    public CollectionItemBuilder setName(String name) {
        this.book.setName(name);
        return this;
    }

    @Override
    public CollectionItemBuilder setYear(int year) {
        book.setYear(year);
        return this;
    }

    @Override
    public CollectionItemBuilder setPublisher(String publisher) {
        book.setPublishingCompany(publisher);
        return this;
    }

    @Override
    public CollectionItemBuilder addAuthor(String author) {
        book.addAuthor(author);
        return this;
    }

    @Override
    public CollectionItemBuilder addContent(String content) {
        book.addChapter(content);
        return this;
    }
}
