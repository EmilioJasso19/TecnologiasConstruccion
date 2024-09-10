package Bloque1.SOLID.SRPDianaAlegria.RefactoringSRP;

public class LibraryMember {

    private String name;
    private String memberId;

    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void borrowBook(Book book) {
        System.out.println(name + " ha solicitado el préstamo del libro: " + book.getTitle());
    }

    public void returnBook(Book book) {
        System.out.println("El libro " + book.getTitle() + " ha sido devuelto");
    }
}
