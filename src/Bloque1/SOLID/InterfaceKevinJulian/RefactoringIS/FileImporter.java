package Bloque1.SOLID.InterfaceKevinJulian.RefactoringIS;

public class FileImporter {
    public void importFile(SupportsRenaming file, String name) {
        file.rename(name);
    }
}
