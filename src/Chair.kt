class Chair(
    val id: Int,
    val hasCushion: Boolean
) {
    fun info() {
        println("Chair ID: $id, Has Cushion: $hasCushion")
    }
}