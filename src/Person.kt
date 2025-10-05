/**
 * Kelas abstrak dasar untuk Staff, Student, dan Teacher (Warisan/Generalisasi)
 * Di UML, Person adalah Superclass.
 */
abstract class Person(
    open val code: String, // Atribut dasar, diasumsikan sebagai ID/Code
    open val name: String, // Atribut dasar
) {
    open fun display() {
        println("Person Code: $code, Name: $name")
    }
}