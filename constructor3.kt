class Automobile(val name:String,val tyres:Int,val maxSeating:Int,var hasAirBags:Boolean){
    init{
        println("$name is created")

    }
    var airBags=hasAirBags
    init{
        println("2nd Initializar Block")
    }
    fun drive(){}
    fun applyBreak(){}
}
fun main(){
    var car=Automobile(name="car",tyres=4,maxSeating=4,hasAirBags=true)
    println(car.name)
    println(car.tyres)
    println(car.maxSeating)
    

}
