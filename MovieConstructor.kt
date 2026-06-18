class Movie(var movieName:String,var rating:Int){
    fun ShowData(){
        println("Movie Name is : $movieName\nMovie rating is : $rating")
    }
}
fun main(){
    print("Enter movie name : ")
    var MovieName=readLine()!!
    print("How many rating you are giveing : ")
    var Rating=readLine()!!.toInt()
    var movie=Movie(MovieName,Rating)
    movie.ShowData()
}