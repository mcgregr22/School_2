class Room(
    val tableList: MutableList<Table> = mutableListOf(),
    val chairList: MutableList<Chair> = mutableListOf(),
    var CSStaff: Staff // Relasi 1 Staff
) {
    fun addTable(table: Table) {
        tableList.add(table)
    }

    fun addChair(chair: Chair) {
        chairList.add(chair)
    }

    fun displayRoomInfo() {
        CSStaff.info()
        println("Tables: ${tableList.size}, Chairs: ${chairList.size}")
    }
}