package dk.ilios.example.library

import io.realm.RealmObject

open class LibraryKotlinModel : RealmObject() {
    open var libraryKotlinField: String? = ""
}