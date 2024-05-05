
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

