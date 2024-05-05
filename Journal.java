

// Journal.java
public class Journal extends Item {
    public Journal(String title, String author) {
        super(title, author);
    }

    @Override
    public String getResourceType() {
        return "Journal";
    }
}


