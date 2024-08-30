package Bloque1.SOLID;

import Bloque1.SOLID.RefactoringSRP.Book;
import Bloque1.SOLID.RefactoringSRP.Library;
import Bloque1.SOLID.RefactoringSRP.LibraryMember;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("LIS", "Mag", true);
        LibraryMember member = new LibraryMember("Emilio", "JL0901AE");
        Library usbi = new Library(book, member);

        usbi.showStatusBook();
        usbi.lendBook();
        usbi.showStatusBook();
        usbi.returnBook();
        usbi.showStatusBook();


    }
}
