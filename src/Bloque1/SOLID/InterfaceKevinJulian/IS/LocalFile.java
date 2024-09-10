package Bloque1.SOLID.InterfaceKevinJulian.IS;

public class LocalFile implements FileInterface {

    private String name;
    private String ownerUsername;
    private String ownerGroupName;
    private String extension;

    public LocalFile(String name, String ownerUserName, String ownerGroupName) {
        this.name = name;
        this.ownerUsername = ownerUserName;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void changeExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }

    @Override
    public void changeOwner(String user, String group) {
        this.ownerUsername = user;
        this.ownerGroupName = group;
    }
}
