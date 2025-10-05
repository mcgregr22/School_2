class Curriculum(
    val subjectList: List<Subject>
) {
    init {
        // Memastikan kurikulum setidaknya punya satu mata pelajaran [1..*]
        require(subjectList.isNotEmpty()) { "Kurikulum setidaknya punya satu mata pelajaran." }
    }
}