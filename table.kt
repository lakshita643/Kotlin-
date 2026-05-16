fun main(){
    print("Enter any number you want to table that number:")
    var number=readLine()!!.toInt()
    for(i in 1..10){
        println("$number * $i= ${number*i}")
     }
    
}