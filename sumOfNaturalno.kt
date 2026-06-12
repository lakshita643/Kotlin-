fun main(){
    print("Enter that number you want to sum: ")
    var a=readLine()!!.toInt()
    var sum=0
    while(a!=0){
        sum=sum+a
        a--
        
    }
    print("Sum of Natural numbers is : $sum")
}