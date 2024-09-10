package Bloque1.SOLID.InterfaceKevinJulian.IS;

public class DropboxFile implements FileInterface {

    private String name;
    private String ownerUsername;
    private String ownerGroupName;
    private String extension;

    public DropboxFile(String name, String ownerUsername, String ownerGroupName) {
        this.name = name;
        this.ownerUsername = ownerUsername;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }

    @Override
    public void changeOwner(String user, String group) {
        //
    }

    @Override
    public void changeExtension(String extension) {
        //
    }
}
