fun main() {

    println("===== SISTEM AKADEMIK UNIVERSITAS =====")

    // === Membuat Data Dasar ===
    val staff1 = Staff("S001", "Budi Santoso", "Cleaning Service")
    val staff2 = Staff("S002", "Agus Prasetyo", "Field Manager")

    val teacher1 = Teacher("T001", "Dr. Maria", "Mathematics")
    val teacher2 = Teacher("T002", "Mr. John", "Physics")
    val teacher3 = Teacher("T003", "Mrs. Lina", "Chemistry")

    val student1 = Student("ST001", "Rina Andayani")
    val student2 = Student("ST002", "Andi Saputra")
    val student3 = Student("ST003", "Dewi Lestari")

    // === Membuat Subject dan Curriculum ===
    val subjMath = Subject("Mathematics", "MTH101")
    val subjPhysics = Subject("Physics", "PHY201")
    val subjChemistry = Subject("Chemistry", "CHM301")

    val curriculum = Curriculum(listOf(subjMath, subjPhysics, subjChemistry))

    println("\n=== Kurikulum Berisi Mata Pelajaran ===")
    curriculum.subjectList.forEach { println("- ${it.code}: ${it.name}") }

    // === Membuat Course dan relasi ke Teacher & Student ===
    val courseA = Course("Kelas A - Pagi", subjMath)
    val courseB = Course("Kelas B - Siang", subjPhysics)

    courseA.addTeacher(teacher1)
    courseB.addTeacher(teacher2)

    student1.enrollCourse(courseA)
    student2.enrollCourse(courseA)
    student3.enrollCourse(courseB)

    // === Membuat Student Organisation ===
    val organisation = StudentOrganisation("BEM Fakultas Sains")
    organisation.addLeader(student1)
    organisation.addMember(student2)
    organisation.addMember(student3)

    println("\n=== Organisasi Mahasiswa ===")
    println("Nama Organisasi : ${organisation.name}")
    println("Leaders         : ${organisation.leaders.joinToString { it.name }}")
    println("Anggota         : ${organisation.members.joinToString { it.name }}")

    // === Membuat Teacher Board ===
    val teacherBoard = TeacherBoard(leader = teacher1)
    teacherBoard.addTeacher(teacher2)
    teacherBoard.addTeacher(teacher3)
    println("\n=== Teacher Board ===")
    println("Leader          : ${teacherBoard.leader.name}")
    println("Daftar Guru     : ${teacherBoard.teacherList.joinToString { it.name }}")

    teacherBoard.changeLeader(teacher2)
    println("Leader Baru     : ${teacherBoard.leader.name}")

    // === Membuat Management ===
    val management = Management(principal = teacher1, fieldManager = staff2, initialManagers = listOf(teacher2))
    println("\n=== Management ===")
    println("Principal       : ${management.principal.name}")
    println("Field Manager   : ${management.fieldManager.name}")
    println("Manager List    : ${management.managerList.joinToString { it.name }}")

    // === Membuat Room, Table, dan Chair ===
    val table1 = Table(1, "Wood")
    val table2 = Table(2, "Steel")

    val chair1 = Chair(1, true)
    val chair2 = Chair(2, false)
    val chair3 = Chair(3, true)

    val room1 = Room(
        tableList = mutableListOf(table1, table2),
        chairList = mutableListOf(chair1, chair2, chair3),
        CSStaff = staff1
    )

    // === Tampilkan Informasi ===
    println("\n=== Informasi Guru ===")
    teacher1.showInfo()
    teacher2.showInfo()

    println("\n=== Informasi Mahasiswa ===")
    student1.display()
    student2.display()
    student3.display()

    println("\n=== Informasi Ruangan ===")
    room1.displayRoomInfo()

}
