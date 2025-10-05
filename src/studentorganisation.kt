class studentorganisation {
    open class Person(
        var name: String,
        var id: String
    )

    class Student(
        name: String,
        id: String,
        var major: String
    ) : Person(name, id) {
        fun showStudentInfo() {
            println("Student Name: $name, ID: $id, Major: $major")
        }
    }

    class StudentOrganisation(
        val leaders: MutableList<Student> = mutableListOf()
    ) {

        fun addLeader(student: Student) {
            leaders.add(student)
            println("${student.name} has been added as a leader.")
        }

        fun removeLeader(student: Student) {
            if (leaders.remove(student)) {
                println("${student.name} has been removed from leaders.")
            } else {
                println("${student.name} is not in the leader list.")
            }
        }

        fun showLeaders() {
            if (leaders.isEmpty()) {
                println("No student leaders currently.")
            } else {
                println("Student Leaders:")
                leaders.forEach { it.showStudentInfo() }
            }
        }
    }

    fun main() {
        val s1 = Student("Alice", "S001", "Computer Science")
        val s2 = Student("Bob", "S002", "Information Systems")

        val organisation = StudentOrganisation()
        organisation.addLeader(s1)
        organisation.addLeader(s2)

        organisation.showLeaders()
    }

}