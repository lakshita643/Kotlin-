class car(val name:String,val type:String,var kmRan:Int) {
    //It is a class properties.
    fun driveCar(){
        println("Car is driving.")
    }
    fun applyBrakes(){
        println("Aplied Brackes")
    }
}
fun main(){
    val mustang=car(name="mustang",type="petrol",kmRan=100)
    println(mustang.name)
    println(mustang.type)
    println(mustang.kmRan)
}
    