class TeacherBoard(
    var leader: Teacher
) {
    val teacherList: MutableList<Teacher> = mutableListOf()

    fun addTeacher(teacher: Teacher) {
        teacherList.add(teacher)
    }

    fun removeTeacher(teacher: Teacher) {
        teacherList.remove(teacher)
    }

    fun displayBoardInfo() {
        println("===== Teacher Board =====")
        println("Leader: ${leader.name}")
        println("Teachers:")
        teacherList.forEach {
            println("- ${it.name}")
        }
    }
}
