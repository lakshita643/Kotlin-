fun main(){
    print("Enter size of the array:")
    val size=readLine()!!.toInt()
    val arr=IntArray(size)
    println("Enter array element:")
    for(i in arr.indices){//arr.indices means array ke sbhi valid index ki position.
        
        arr[i]=readLine()!!.toInt()
    }
    print(arr.joinToString())
}