fun main(){
    print("Enter the Number:")
    var n=readLine()!!.toInt()
    var factorial=1
    for(i in 1..n){
        factorial=factorial*i
        }
    println("Factorial of $n is $factorial")

}