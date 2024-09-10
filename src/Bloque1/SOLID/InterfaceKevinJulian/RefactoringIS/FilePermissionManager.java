package Bloque1.SOLID.InterfaceKevinJulian.RefactoringIS;

public class FilePermissionManager {

    public void transferOwnership( SupportsChangeOfOwnership file, String ownerUsername, String ownerGroupName) {
        file.changeOwner(ownerUsername, ownerGroupName);
    }
}
