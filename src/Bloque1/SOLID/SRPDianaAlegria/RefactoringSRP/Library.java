package Bloque1.SOLID.SRPDianaAlegria.RefactoringSRP;

public class Library {

    private Book book;
    private LibraryMember member;

    public Library(Book book, LibraryMember member) {
        this.book = book;
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LibraryMember getMember() {
        return member;
    }

    public void setMember(LibraryMember member) {
        this.member = member;
    }

    public void lendBook() {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("El libro " + book.getTitle() + " no está disponible");
        } else {
            System.out.println("El libro " + book.getTitle() + " está disponible");
        }
    }

    public void returnBook() {
        book.setAvailable(false);
        System.out.println("El libro " + book.getTitle() + " ha sido devuelto");
    }

    public void showStatusBook() {
        System.out.println("El estado actual del libro " + book.isAvailable());
    }
}
