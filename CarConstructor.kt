class car(var name:String,var tyres:Int,var seating:Int,var engineType:String){
    
    
    constructor(name:String,engineType:String)
        : this(name,4,5,engineType)
                         //Secondary Constructor aese banate he
    fun displayData(){
        println("Car Name: $name")
        println("Tyres: $tyres")
        println("Seating: $seating")
        println("Engine Type: $engineType")
       

    }



    
}
fun main(){
    print("Enter Name of the car: ")
    var Name=readLine()!!
    print("Enter number of tyres: ")
    var Tyres=readLine()!!.toInt()
    print("Enter seating numbers: ")
    var Seating=readLine()!!.toInt()
    print("Enter engine type: ")
    var EngineType=readLine()!!
    var Car1=car(Name,Tyres,Seating,EngineType)
    Car1.displayData()
    print("Enter car name:")
    var a=readLine()!!
    print("Enter Engine Type:")
    var b=readLine()!!
    var Car2=car(a,b)
    
    Car2.displayData()


}