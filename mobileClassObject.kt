class mobile(val Brand:String,val Model:String){
    fun ShowData(){
        println("Brand Name:$Brand")
        println("Model Name:$Model")

    }
    
}/*Normal class_object banaya he */
fun main(){
    print("Enter Brand of the Mobile:")
    var brand=readLine()!!
    print("Enter Model of the Mobile:")
    var model=readLine()!!
    var mb=mobile(brand,model)
    mb.ShowData()
}