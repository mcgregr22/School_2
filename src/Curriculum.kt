// ini buat object Subject, isinya cuma nama sama kode mapel aja.
data class Subject(val name: String, val code: String)

class Curriculum(
// isinya ya list dari object Subject yg di atas tadi.
    val subjectList: List<Subject>

) {
    init {
// ini buat ngecek, list mapel yg dikasih itu ga boleh kosong.
        require(subjectList.isNotEmpty()) { "Kurikulum setidaknya punya satu mata pelajaran." }
    }
}