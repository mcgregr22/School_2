fun main() {
    val initialSubjects = listOf(
        Subject("Matematika Minat", "MTK-01"),
        Subject("Biologi", "BIO-01"),
        Subject("Fisika", "FSK-01")
    )
    println("Memulai proses pembuatan kurikulum")

    if (initialSubjects.isNotEmpty()) {

        println("List subject terdeteksi ada isinya. ")

        val schoolCurriculum = Curriculum(initialSubjects)

        println("Objek Kurikulum berhasil dibuat.")
        println("Mata pelajaran di dalamnya:")
        schoolCurriculum.subjectList.forEach { subject ->
            println("- ${subject.name} (${subject.code})")
        }

    } else {

        println("Error: Tidak bisa membuat kurikulum karena daftar mata pelajaran kosong.")
    }

    println("\nProses selesai.")
}