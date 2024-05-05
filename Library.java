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
