/**
 * Kelas Staff (Turunan dari Person)
 * Relasi: 1 Staff di Room (sebagai CSStaff), 1 Staff di Management (sebagai fieldManager)
 */
class Staff(
    code: String,
    name: String,
    val role: String // Atribut tambahan untuk peran/jabatan
) : Person(code, name) {
    fun info() {
        println("Staff Code: $code, Name: $name, Role: $role")
    }

    override fun display() {
        super.display()
        println("Role: $role")
    }
}