
class Teacher(
    code: String,
    name: String,
    val specialization: String
) : Person(code, name) {

    private val courseList = mutableListOf<Course>()

    fun addCourse(course: Course) {
        courseList.add(course)
    }

    override fun display() {
        super.display()
        println("Specialization : $specialization")
    }

    fun showInfo() {
        display()
        println("Courses Taught : ${courseList.size} courses.")
    }
}