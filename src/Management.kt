class Management(
    var principal: Teacher,
    var managerList: MutableList<Teacher> = mutableListOf(),
    var fieldManager: Staff
) {

    fun addManager(teacher: Teacher) {
        managerList.add(teacher)
    }

    fun removeManager(teacher: Teacher) {
        managerList.remove(teacher)
    }
}
