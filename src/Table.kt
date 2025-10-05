class Table(
    val id: Int,
    val material: String
) {
    fun info() {
        println("Table ID: $id, Material: $material")
    }
}