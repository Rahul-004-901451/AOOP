package library.management;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryManagement {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void addMember(Member member) {
        members.add(member);
    }

    @Override
    public boolean borrowBook(String title, String memberId) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isBorrowed()) {
                book.borrow();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean returnBook(String title, String memberId) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isBorrowed()) {
                book.returnBook();
                return true;
            }
        }
        return false;
    }
}
