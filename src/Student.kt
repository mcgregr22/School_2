/**
 * Kelas Student (Turunan dari Person)
 * Relasi: 0..* Course (enrollment), 0..1 StudentOrganisation
 */
class Student(
    code: String,
    name: String,
) : Person(code, name) {

    var courses: MutableList<Course> = mutableListOf()
    var organisation: StudentOrganisation? = null

    fun enrollCourse(course: Course) {
        courses.add(course)
        course.addStudent(this) // Memastikan Course juga menyimpan Student ini
    }

    fun joinOrganisation(organisation: StudentOrganisation) {
        this.organisation = organisation
        // Asumsi: Student juga ditambahkan sebagai anggota (atau leader) di organisasi
    }

    override fun display() {
        super.display()
        println("Courses Enrolled: ${courses.size}")
    }
}