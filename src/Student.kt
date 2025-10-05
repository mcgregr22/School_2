
class Student(
    name: String,
    age: Int
) : Person(name, age) {

    var courses: MutableList<Course> = mutableListOf()
    var organisation: StudentOrganisation? = null

    fun enrollCourse(course: Course) {
        courses.add(course)
    }

    fun joinOrganisation(organisation: StudentOrganisation) {
        this.organisation = organisation
    }
}
