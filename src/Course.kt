/**
 * Kelas Course
 * Relasi: 0..* studentList: Student, 0..* teacherList: Teacher, 1 subject: Subject
 */
class Course(
    var name: String, // Nama sesi/kelas (misal: 'Kelas A Pagi')
    var subject: Subject // Relasi 1 Subject (WAJIB)
) {
    var studentList: MutableList<Student> = mutableListOf()
    var teacherList: MutableList<Teacher> = mutableListOf()

    fun addStudent(student: Student) {
        if (!studentList.contains(student)) {
            studentList.add(student)
        }
    }

    fun addTeacher(teacher: Teacher) {
        if (!teacherList.contains(teacher)) {
            teacherList.add(teacher)
        }
    }
}