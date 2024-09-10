package Bloque1.SOLID.SRPDianaAlegria;

import Bloque1.SOLID.SRPDianaAlegria.RefactoringSRP.Book;
import Bloque1.SOLID.SRPDianaAlegria.RefactoringSRP.Library;
import Bloque1.SOLID.SRPDianaAlegria.RefactoringSRP.LibraryMember;

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
