class Automobile(val name:String,val tyres:Int,val maxString:Int){
    fun drive(){
       println("Car is Good!") 
    }
    fun applyBreak(){}

}
fun main(){
    var car=Automobile(name="car",tyres=4,maxString=5)
    println(car.drive())
}