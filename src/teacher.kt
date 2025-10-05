// Kelas Teacher turunan dari Person
open class Person(
    var name: String,
    var address: String
)

class teacher(
    name: String,
    address: String,
    var teacherId: String,
    var specialization: String
) : Person(name, address) {

    private val courseList = mutableListOf<Course>()

    fun addCourse(course: Course) {
        courseList.add(course)
    }

    fun showInfo() {
        println("=== Teacher Information ===")
        println("Name           : $name")
        println("Address        : $address")
        println("Teacher ID     : $teacherId")
        println("Specialization : $specialization")
        println("Courses        :")
        if (courseList.isEmpty()) {
            println("  No courses assigned.")
        } else {
            courseList.forEach { println("  - ${it.subjectName}") }
        }
        println("============================")
    }
}

class Course(val subjectName: String)
