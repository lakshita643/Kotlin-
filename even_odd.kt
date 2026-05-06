fun main(){
    println("Enter Number: ")
    var a=readLine()!!.toInt()//!! iska mtlb he ki confirm hota he ki value null nhi hogi
    if(a % 2 == 0){
        println("a is Even number.")
    }
    else{
        println("a is Odd number.")
    }
}