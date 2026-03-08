package dam.exer_vl

class DigitalBook(
    title: String,
    author: String,
    publicationYear: Int,
    availableCopies: Int,
    val fileSize: Int,
    val format: String
) : Book(title, author, publicationYear, availableCopies) {

    override fun toString(): String {
        return super.toString() + "DigitalBookProprieties: $format, $fileSize MB"
    }
}