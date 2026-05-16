fun evenOrodd(x:Int){
    if (x%2==0){
        println("x is a Even number!")
    }else{
        println("x is a Odd number!")
    }
}
fun main(){
    print("Enter a value of x:")
    val x=readLine()!!.toInt()
    evenOrodd(x)
}