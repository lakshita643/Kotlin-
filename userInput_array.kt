fun main(){
    print("Enter size of the array:")
    val size=readLine()!!.toInt()
    val arr=IntArray(size)
    println("Enter array element:")
    for(i in arr.indices){
        
        arr[i]=readLine()!!.toInt()
    }
    print(arr.joinToString())
}