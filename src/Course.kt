class Course(
    var name: String,
    var studentList: MutableList<Student> = mutableListOf(),
    var teacherList: MutableList<Teacher> = mutableListOf(),
    var subject: Subject
) {

    fun addStudent(student: Student) {
        studentList.add(student)
    }

    fun addTeacher(teacher: Teacher) {
        teacherList.add(teacher)
    }
}