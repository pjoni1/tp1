package dam.exer_vl

class Book (
    val title : String,
    val author : String,
    val publicationYear : Int,
    var avaiableCopies : Int

){
    init {
        println("A new book has been created: $title - written by $author")
    }
    val bookStyle : String
        get(){
            if( publicationYear < 1980){
                return "Classic"
            }else if(publicationYear >= 1980  && publicationYear < 2000){
                return "Modern"
            }else{
                return "Contemporary"
            }
        }

    var availableCopies: Int = avaiableCopies
        get() = field //getter padrão
        set(value){
            if (value < 0){
                println("Error: There cannot be negative copies.")
                field = 0
            }else if(value == 0){
                println("Warning: Book is now out of stock!")
                field = 0
            }else{
                field = value
            }
        }

}