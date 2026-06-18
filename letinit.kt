class Calculator{
    lateinit var message:String//lateinit ka matlab: value baad me assign karenge.
                                //message abhi initialize nahi hua hai.
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
}//Is code me message use nahi hua, isliye koi error nahi aayegi.
/*agar aap ye likh do:

println(ob.message)

to error aayega:

kotlin.UninitializedPropertyAccessException:
lateinit property message has not been initialized

Kyunki message ko abhi tak value nahi mili. */