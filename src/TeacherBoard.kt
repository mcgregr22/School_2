/**
 * Kelas TeacherBoard (Baru dibuat sesuai permintaan)
 * Relasi: 0..* teacherList: Teacher, 1 leader: Teacher
 */
class TeacherBoard(
    var leader: Teacher // Relasi 1 Teacher (leader)
) {
    // teacherList: Teacher[0..*]
    val teacherList: MutableList<Teacher> = mutableListOf()

    init {
        // Pastikan leader selalu ada di dalam teacherList
        if (!teacherList.contains(leader)) {
            teacherList.add(leader)
        }
    }

    fun addTeacher(teacher: Teacher) {
        if (!teacherList.contains(teacher)) {
            teacherList.add(teacher)
        }
    }

    fun removeTeacher(teacher: Teacher) {
        // Tidak boleh menghapus leader, kecuali leader diganti
        if (teacher != leader) {
            teacherList.remove(teacher)
        } else {
            println("Error: Ganti pemimpin terlebih dahulu sebelum menghapus guru ini.")
        }
    }

    fun changeLeader(newLeader: Teacher) {
        // Pastikan pemimpin baru ada di list, jika tidak, tambahkan.
        if (!teacherList.contains(newLeader)) {
            addTeacher(newLeader)
        }
        this.leader = newLeader
        println("Teacher Board leader changed to ${newLeader.name}.")
    }
}