fun main(){
    print("Enter a number to check prime number :")
    var a=readLine()!!.toInt()
    var isPrime=true
    if(a<=1){
        isPrime=false
    }
    else{
        for(i in 2 until a){
            if(a%i==0){
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