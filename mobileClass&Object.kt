class mobile(val Brand:String,val Model:String){
    fun ShowData(){
        print("Brand Name:$Brand")
        println("Model Name:$Model")

    }
    
}
fun main(){
    println("Enter Brand of the Mobile:")
    var brand=readLine()!!
    println("Enter Model of the Mobile:")
    var model=readLine()!!
    var mb=mobile(brand,model)
    mb.ShowData()
}