package dk.ilios.example.library;

import io.realm.RealmObject;

public class LibraryModel extends RealmObject {
    public String libraryField;
    private String privateLibraryField;

    public String getPrivateLibraryField() {
        return privateLibraryField;
    }

    public void setPrivateLibraryField(String privateLibraryField) {
        this.privateLibraryField = privateLibraryField;
    }


}
