class Student(
    name: String,
    address: String,
    phoneNumber: String,
    var studentId: String
) : Person(name, address, phoneNumber) {

    var courses: MutableList<Course> = mutableListOf()
    var organisation: StudentOrganisation? = null

    fun enrollCourse(course: Course) {
        courses.add(course)
        course.addStudent(this)
    }

    fun joinOrganisation(organisation: StudentOrganisation) {
        this.organisation = organisation
        organisation.addMember(this)
    }

    override fun display() {
        super.display()
        println("studentId = $studentId")
    }
}
