/**
 * Kelas StudentOrganisation
 * Relasi: 0..* leaders: Student
 */
class StudentOrganisation(
    val name: String,
    val leaders: MutableList<Student> = mutableListOf()
) {
    // List untuk semua anggota (selain leader) agar lebih fungsional
    val members: MutableList<Student> = mutableListOf()

    fun addLeader(student: Student) {
        if (!leaders.contains(student)) {
            leaders.add(student)
            addMember(student)
        }
    }

    fun addMember(student: Student) {
        if (!members.contains(student)) {
            members.add(student)
        }
    }
}