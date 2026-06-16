class person(nameparam:String,ageparam:Int){
    var name:String=nameparam
    get(){//useing getter
        println("Name getter is called")
        return field.uppercase()
    }
    var age:Int=ageparam
    set(value){//using setter 
    //seter ka use is liye ki kisi varible par condtion lga sake.
        if (value>0){
            field=value
        }
        else{
            println("Age cant be negative!")
        }
    }
}
fun main(){
    val p1=person(nameparam="cheezy",ageparam=22)
    println(p1.age)
    println(p1.name)
    p1.age=-22
    
    
}