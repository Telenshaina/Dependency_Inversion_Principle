public abstract class Item {
    private String title;
    private String author;

    public Item(String title, String author) {
        this.title = title;
        this.author = author;
    }
//getters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract String getResourceType();
}

