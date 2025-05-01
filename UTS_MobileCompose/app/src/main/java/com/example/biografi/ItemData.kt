import com.example.biografi.R

val bioDataArray = arrayOf(
    "Randy Febrian",
    "2310817110013",
    "Teknologi Informasi",
    "4",
    "Universitas Lambung Mangkurat",
    "Android Development dan Web Development",
    "HMTI FT ULM",
    "Baca Buku dan Bersepeda",
    "Ingin menciptakan aplikasi yang bermanfaat untuk masyarakat"
)

val infoArray = arrayOf(
    "Nama: ",
    "NIM: ",
    "Program Studi: ",
    "Semester: ",
    "Universitas: ",
    "Hobi: ",
    "Organisasi: ",
    "Minat: ",
    "Motivasi: "
)

data class experience(
    val name: String,
    val pictureId: Int,
    val description: Int
)

val itemList = listOf<experience>(
    experience("Pelatih Olimpiade Sains Nasional Kebumian SMA", R.drawable.foto_osn, R.string.osn),
    experience("Pengurus HMTI FT ULM", R.drawable.hmti, R.string.hmti),
    experience("Asisten Praktikum", R.drawable.asprak, R.string.asprak),
)

val bioDataArrayMain = arrayOf(
    "Randy Febrian",
    "2310817110013",
    "Teknologi Informasi",
    "4",
    "Universitas Lambung Mangkurat")

val infoArrayMain = arrayOf(
    "Nama: ",
    "NIM: ",
    "Program Studi: ",
    "Semester: ",
    "Universitas: ",
)