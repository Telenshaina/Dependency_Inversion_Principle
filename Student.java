// Item.java
public abstract class Item {
    private String title;
    private String author;

    public Item(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract String getResourceType();
}

// Book.java
public class Book extends Item {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public String getResourceType() {
        return "Book";
    }
}

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

// Borrower.java
public interface Borrower {
    void borrowItem(Item item);
    void returnItem(Item item);
}

// Library.java
import java.util.HashMap;
import java.util.Map;

public class Library implements Borrower {
    private Map<Item, Integer> borrowedItems;

    public Library() {
        borrowedItems = new HashMap<>();
    }

    @Override
    public void borrowItem(Item item) {
        if (isAvailable(item)) {
            borrowedItems.put(item, borrowedItems.getOrDefault(item, 0) + 1);
            System.out.println("Borrowed: " + item.getTitle() + " (" + item.getResourceType() + ")");
        } else {
            System.out.println("Item not available for borrowing: " + item.getTitle());
        }
    }

    @Override
    public void returnItem(Item item) {
        if (borrowedItems.containsKey(item)) {
            int quantity = borrowedItems.get(item);
            if (quantity > 1) {
                borrowedItems.put(item, quantity - 1);
            } else {
                borrowedItems.remove(item);
            }
            System.out.println("Returned: " + item.getTitle() + " (" + item.getResourceType() + ")");
        } else {
            System.out.println("Item not found in borrowed items: " + item.getTitle());
        }
    }

    private boolean isAvailable(Item item) {
        // Simplified availability check (you can add more complex logic here)
        return true; // Assume all items are available for demonstration
    }
}

// Student.java
public class Student {
    private Borrower borrower;

    public Student(Borrower borrower) {
        this.borrower = borrower;
    }

    public void borrowResource(Item item) {
        borrower.borrowItem(item);
    }

    public void returnResource(Item item) {
        borrower.returnItem(item);
    }
}

// Main.java (Sample Usage)
public class Main {
    public static void main(String[] args) {
        Borrower library = new Library();
        Student student = new Student(library);

        Item book = new Book("Clean Code", "Robert C. Martin");
        Item journal = new Journal("Science Journal", "Various Authors");

        student.borrowResource(book);
        student.borrowResource(journal);

        student.returnResource(book);
        student.returnResource(journal);
    }
}
