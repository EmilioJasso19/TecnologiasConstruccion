package Bloque1.SOLID.DianaAlegria.SRP;

import java.awt.print.Book;

public class Library {

    public String titleBook;
    public String author;
    public boolean isAvailable;
    public String memberName;
    public String memberID;
    public Book book;

    public Library(String bookName, String author, boolean isAvailable, String memberName, String memberID) {
        this.titleBook = bookName;
        this.author = author;
        this.isAvailable = isAvailable;
        this.memberName = memberName;
        this.memberID = memberID;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void lendBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("El libro " + titleBook + " no está disponible");
        } else {
            System.out.println("El libro " + titleBook + " está disponible");
        }
    }

    public void returnBook() {
        isAvailable = false;
        System.out.println("El libro " + titleBook + " ha sido devuelto");
    }

    public void borrowBook() {
        System.out.println(memberName + " ha solicitado el préstamo del libro: " + titleBook);
    }

    public void showStatusBook() {
        System.out.println("El estado actual del libro " + isAvailable);
    }
}

class Main {
    public static void main(String[] args) {
        Library usbi = new Library("Fundamentos de SO", "Vergara", true, "Emilio", "1");
        usbi.showStatusBook();
        usbi.lendBook();
        usbi.showStatusBook();
        usbi.returnBook();
        usbi.showStatusBook();
    }
}