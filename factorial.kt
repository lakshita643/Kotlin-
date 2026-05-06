fun main(){
    print("Enter that number do you want to factorial:")
    var n=readLine()!!.toInt()
    var isPrime= true
    if(n<=1){
        isPrime=false
    }
    else{
        for(i in 2 until n){
            if(n%i==0){
                isPrime=false
                break
            }
        }
    }
    if(isPrime){
        println("Number is Prime!")
    }
    else{
        println("Number is not Prime!")
    }
}