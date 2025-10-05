class Room {
    // Kelas Table
    class Table(
        val id: Int,
        val material: String
    ) {
        fun info() {
            println("Table ID: $id, Material: $material")
        }
    }

    // Kelas Chair
    class Chair(
        val id: Int,
        val hasCushion: Boolean
    ) {
        fun info() {
            println("Chair ID: $id, Has Cushion: $hasCushion")
        }
    }

    // Kelas Staff
    class Staff(
        val name: String,
        val role: String
    ) {
        fun info() {
            println("Staff Name: $name, Role: $role")
        }
    }

    // Kelas Room
    class Room(
        val tableList: MutableList<Table> = mutableListOf(),
        val chairList: MutableList<Chair> = mutableListOf(),
        var CSStaff: Staff
    ) {
        fun addTable(table: Table) {
            tableList.add(table)
            println("Added table with ID: ${table.id}")
        }

        fun addChair(chair: Chair) {
            chairList.add(chair)
            println("Added chair with ID: ${chair.id}")
        }

        fun displayRoomInfo() {
            println("Room Information:")
            CSStaff.info()

            println("\nTables:")
            tableList.forEach { it.info() }

            println("\nChairs:")
            chairList.forEach { it.info() }
        }
    }

}