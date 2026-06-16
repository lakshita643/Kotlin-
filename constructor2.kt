class Automobile(val name:String,val tyres:Int,val maxSeating:Int,val engineType:String){
    init{
        println("$name is created")
    }
    init{
        println("Second init Block.")
    }
    constructor(nameParam:String,engineparam:String)
    :this(nameParam,4,5,engineparam)
    fun drive(){}
    fun applyBreak(){}
}
fun main(){
    var car=Automobile(name="Car",tyres=4,maxSeating=5,engineType="Petrol")
    var car2=Automobile(name="Car2",tyres=4,maxSeating=5,engineType="Petrol")
    println(car.name)
    println(car.tyres)
    println(car.maxSeating)
    println(car.engineType)
    println(car2.name)
    println(car2.tyres)
    println(car2.maxSeating)
    println(car2.engineType)
    //uper likha usme kuchh same he to ab aese bhi likh skhte he
    var dx=Automobile(nameParam="car",engineparam="petrol")
    var dx2=Automobile(nameParam="car2",engineparam="petrol")
    println(dx.name)
    println(dx.engineType)
    println(dx2.name)
    println(dx2.engineType)
}