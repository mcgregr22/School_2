class Management(
    val principal: Teacher, // Relasi 1 Teacher
    val fieldManager: Staff // Relasi 1 Staff
) {
    // managerList: Teacher[1..*]. Minimal harus ada 1 manager.
    val managerList: MutableList<Teacher> = mutableListOf()

    // Constructor tambahan untuk memastikan managerList terisi minimal 1
    constructor(principal: Teacher, fieldManager: Staff, initialManagers: List<Teacher>) : this(principal, fieldManager) {
        require(initialManagers.isNotEmpty()) { "Manajemen harus memiliki minimal satu manager." }
        managerList.addAll(initialManagers)
    }

    fun addManager(teacher: Teacher) {
        managerList.add(teacher)
    }

    fun removeManager(teacher: Teacher) {
        if (managerList.size > 1) { // Jangan sampai managerList kosong [1..*]
            managerList.remove(teacher)
        } else {
            println("Error: Tidak bisa menghapus manager, karena harus ada minimal satu manager.")
        }
    }
}