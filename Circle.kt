class Circle(var radius:Double){
    fun area(){
       var area1=3.14*radius*radius
        println("Area of the circle is : $area1")

    }
}
fun main(){
    print("Enter radius of the circle : ")
    var radius1=readLine()!!.toDouble()
    var circle1=Circle(radius1)
    circle1.area()
}