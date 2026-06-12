class car(val name:String,val type:String,var kmRan:Int) {//giving arguments
    //It is a class properties.
    fun driveCar(){
        println("Car is driving.")
    }
    fun applyBrakes(){
        println("Aplied Brackes")
    }
}
fun main(){
    val mustang=car(name="mustang",type="petrol",kmRan=100)//giving parameters
    println(mustang.name)
    println(mustang.type)
    println(mustang.kmRan)
}
    