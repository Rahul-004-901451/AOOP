package library.management;

public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new Library();

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        Member member1 = new Member("John Doe", "M001");
        Member member2 = new Member("Jane Smith", "M002");

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        System.out.println("Borrowing '1984' by John Doe: " + library.borrowBook("1984", "M001"));
        System.out.println("Returning '1984' by John Doe: " + library.returnBook("1984", "M001"));
        System.out.println("Borrowing '1984' by Jane Smith: " + library.borrowBook("1984", "M002"));
    }
}
