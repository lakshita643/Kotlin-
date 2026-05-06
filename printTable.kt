fun main(){
    print("Enter the number whose table you want to print:")
    var a=readLine()!!.toInt()
    var b=1
    do{
        
        println(a*b)
        b++
    }while(b<=10)
}