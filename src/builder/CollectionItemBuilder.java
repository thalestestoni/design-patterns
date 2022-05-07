package builder;

public interface CollectionItemBuilder {
    CollectionItemBuilder buildItem();
    CollectionItemBuilder setName(String name);
    CollectionItemBuilder setYear(int year);
    CollectionItemBuilder setPublisher(String publisher);
    CollectionItemBuilder addAuthor(String author);
    CollectionItemBuilder addContent(String content);
}
