package library.management;

public interface LibraryManagement {
    void addBook(Book book);
    void addMember(Member member);
    boolean borrowBook(String title, String memberId);
    boolean returnBook(String title, String memberId);
}
