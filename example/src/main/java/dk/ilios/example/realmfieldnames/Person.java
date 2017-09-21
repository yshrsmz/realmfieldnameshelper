package dk.ilios.example.realmfieldnames;

import dk.ilios.example.library.LibraryModel;
import dk.ilios.example.library.LibraryModel2;
import dk.ilios.example.realmfieldnames.lib.Lib2Model;
import dk.ilios.example.realmfieldnames.lib.Lib2ModelJava;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Ignore;

public class Person extends RealmObject {

    public String name;
    public boolean hasDogs; // camel case naming gets converted to uppercase separated by "_"
    public boolean mHasCats; // Hungarian notation is evil and not supported (yet).
    public boolean has_fish; // fields already using "_" are just converted as they are.
    public RealmList<Dog> dogs;
    public Dog favoriteDog;
    public LibraryModel libraryRef;
    public Lib2Model lib2Ref;
    public LibraryModel2 libraryRef2;
    public Lib2ModelJava lib2Ref2;

    @Ignore
    public int random;
}
