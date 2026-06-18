class Rectangle(var length:Double,var width:Double){
    fun area():Double{
        return length*width
        
    }
       
}
fun main(){
    print("Enter length of the rectangle : ")
    var Length=readLine()!!.toDouble()
    print("Enter width of the rectangle : ")
    var Width=readLine()!!.toDouble()
    var Rectangle1=Rectangle(Length,Width)
    println("Area of Rectangle is : ${Rectangle1.area()}")
}