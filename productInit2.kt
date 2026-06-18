class Product(val name:String,val price:Int){
    init{
        println("Product $name created!")//jab constructor call hoga tb init block ki line print hogi.
    }
    fun display(){
        println("Product name is : $name")
        println("Product price ia : $price")
    }
}
fun main(){
    print("Enter product name is : ")
    var Name1=readLine()!!
    print("Enter product Price is : ")
    var Price1=readLine()!!.toInt()
    var product1=Product(Name1,Price1)
    product1.display()
    print("Enter product name :")
    var Name2=readLine()!!
    print("Enter product price :")
    var Price2=readLine()!!.toInt()
    var product2=Product(Name2,Price2)
    product2.display()
}