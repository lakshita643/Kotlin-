class person(var name:String,var age:Int){
    init{
        println("person created")//jab constructor call hoga tb init block ki line print hogi.
    }
    fun Info(){
        println("Person Name is : $name")
        println("Person Age is : $age")
    }
}
fun main(){
    print("Enter person Name : ")
    var Name1=readLine()!!
    print("Enter person Age : ")
    var Age1=readLine()!!.toInt()
    var person1=person(Name1,Age1)
    person1.Info()
    print("Enter person name : ")
    var Name2=readLine()!!
    print("Enter person Age : ")
    var Age2=readLine()!!.toInt()
    var person2=person(Name2,Age2)
    person2.Info()
}