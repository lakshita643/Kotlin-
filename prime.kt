fun main(){
    print("Enter number:")
    var number=readLine()!!.toInt()
    var n=2
    while(number>=n){
        if(number/n==0){
            print("Number is Not prime")
            n++
        }
        else{
            print("Number is Prime")
        }


    }
}