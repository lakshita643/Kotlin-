class AutoMobile(var name:String,var tyres:Int,var maxSeating:Int,var engineType:String){
    init{
        println("Object one is created!")
    }
    init{
        println("Object Second is created!")
    }
    constructor(name:String,engineType:String)
    :this(name,4,5,engineType)
    fun drive(){
        println("Car is Driving!")
    }
    fun applyBreak(){
        println("Apply Breaks!")
    }
    fun showdata(){
        println("Name : $name")
        println("Tyres : $tyres")
        println("Maximum Seating : $maxSeating")
        println("Engine Type : $engineType")
    }


}
fun main(){
    print("Enter Name : ")
    var name1=readLine()!!
    print("Enter Tyres : ")
    var tyres1=readLine()!!.toInt()
    print("Enter maximum Seating : ")
    var maxSeating1=readLine()!!.toInt()
    print("Enter Engine Type : ")
    var engineType1=readLine()!!
    var AutoMobile1=AutoMobile(name1,tyres1,maxSeating1,engineType1)
    var AutoMobile2=AutoMobile(name1,engineType1)
    AutoMobile1.showdata()
    AutoMobile2.showdata()



}