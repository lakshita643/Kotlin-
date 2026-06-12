fun addition(x:Int,y:Int):Int{
    return x+y
}
fun addition(x:Double,y:Double):Double{//It is a function overloding same name ka function but parameters alg alg .
    return x+y
}
fun main(){
   // println(addition(x=3,y=6))
    //println(addition(x=3.0,y=6.0))
    print("Enter value of a:")
    var a=readLine()!!.toInt()//Named argument
    print("Enter value of b:")
    var b=readLine()!!.toInt()//Named argument
    print("Sum of Int numbers = ${addition(a, b)}")
    print("Enter value of c:")
    var c=readLine()!!.toDouble()//Named argument
    print("Enter value of d:")
    var d=readLine()!!.toDouble()//Named argument
    print("Sum of Double numbers = ${addition(c, d)}")

}