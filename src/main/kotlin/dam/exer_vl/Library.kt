package dam.exer_vl

class Library {
    val books = ArrayList<DigitalBook>()

    fun addBook(book: DigitalBook){
        books.add(book)
    }

    fun borrowBook(title: String){
        val book = books.find {it.title == title}
        if (book != null){
            if (book.availableCopies > 0){
                book.availableCopies--
                println("Book has been borrowed: ${book.title}")
            }else{
                println("Book isn't avaiable")
            }
        }else{
            println("Book not found")
        }

    }

    fun returnBook(title: String){
        val book = books.find {it.title == title}
        if (book != null){
            book.availableCopies++
            println("Book has been returned: ${book.title}")
        }else{
            println("Book not found")
        }
    }

    fun showBooks(){
        for (book in books){
            println("----------------")
            println(book.title)
            println(book.author)
            println(book.publicationYear)
            println(book.availableCopies)
            println(book.fileSize)
            println(book.format)
        }
    }

    fun searchByAuthor(author: String){
        for(book in books){
            if (book.author == author){
                println("--------------")
                println(book.title)
            }
        }
    }
}