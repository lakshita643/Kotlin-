class Calculator{
    lateinit var message:String
    fun add(a:Int,b:Int):Int{
        return a+b
    }
    fun multiply(a:Int,b:Int):Int{
        return a*b
    }
}
fun main(){
    val ob=Calculator()
    println(ob.add(a=3,b=2))
    println(ob.multiply(a=3,b=2))
}