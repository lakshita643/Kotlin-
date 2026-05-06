fun main(){
    print("Enter Number:")
    var number=readLine()!!.toDouble()
    var check=if(number>0){
        "Number is Positive!"
    }else if (number<0){
        "Number is Negative!"
    }
    else{
        "Number is Zero!"
    }
    println(check)
}