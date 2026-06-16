class book(val BookName:String,val Title:String,val Author:String){
    fun ShowData(){
        println("Book Name is: $BookName")
        println("Book Title is: $Title")
        println("Book Author is: $Author")
    }
}
fun main(){
    println("Enter the Book Name: ")
    var bookname=readLine()!!
    println("Enter the title of the book: ")
    var title=readLine()!!
    println("Enter author name: ")
    var author=readLine()!!
    var ap=book(bookname,title,author)
    ap.ShowData()
}