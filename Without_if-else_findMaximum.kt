fun main(){
    print("Enter value of x:")
    var x=readLine()!!.toDouble()
    print("Enter value of y:")
    var y=readLine()!!.toDouble()
    print("Enter value of z:")
    var z=readLine()!!.toDouble()
    var max=maxOf(x, y, z)//maxof function ka use kr skte he maximum find krne ke liye.
    println("Maximum number is : = $max")
}
