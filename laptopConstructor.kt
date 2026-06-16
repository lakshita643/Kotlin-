class Laptop(var brand:String,var ram:Int,var price:Int){
    fun display(){
        println("Laptop Brand : $brand\nLaptop Ram : $ram\nLaptop price : $price")
        
    }
    
}
fun main(){
    print("Enter brand of the laptop : ")
    var Brand=readLine()!!
    print("Enter ram of the laptop: ")
    var Ram=readLine()!!.toInt()
    print("Enter price of the laptop: ")
    var Price=readLine()!!.toInt()
    var jk=Laptop(Brand,Ram,Price)
    jk.display()
    
}