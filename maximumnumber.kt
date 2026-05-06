fun main(){
    print("Enter value of a:")
    var a=readLine()!!.toInt()
    print("Enter value of b:")
    var b=readLine()!!.toInt()
    print("Enter value of c:")
    var c=readLine()!!.toInt()
    if(a>b && a>c){
        print("a is maximum number.")
    }else if(b>c){
        print("b is the maximum number.")
    }
    else{
        print("c is the maximum number.")
    }
    
}
