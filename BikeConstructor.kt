class Bike(var name:String,var cc:Int,var price:Int){//primary constructor
    constructor(name:String,cc:Int)//secondary constructor
    :this(name,cc,100000)
    fun displyaInfo(){
        println("Name of the Bike is: $name")
        println("Bike cc is: $cc")
        println("Bike price is: $price")
    }
    
}
fun main(){
    print("Enter Bike Name: ")
    var bike=readLine()!!
    print("Enter Bike CC: ")
    var cC=readLine()!!.toInt()
    print("Enter Bike Price: ")
    var price=readLine()!!.toInt()
    var bike1=Bike(bike,cC,price)
    bike1.displyaInfo()
    var bike2=Bike(bike,cC)
    bike2.displyaInfo()
}