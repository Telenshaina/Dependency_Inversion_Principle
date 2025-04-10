
//main

public class TestProg {
    
    
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
