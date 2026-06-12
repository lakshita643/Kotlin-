 class person(val name:String,var age:Int){
    fun canVote():Boolean{
        return age>18
    }
}
fun main(){
        
        print("Enter your Name:")
        val name=readLine()!!
        print("Enter Your age")
        var age=readLine()!!.toInt()
        val p1=person(name,age)
    println("Name:${p1.name}")
    println("age:${p1.age}")
    if (p1.canVote()){
        println("Can Vote!")
    }else{
        println("Cannote Vote!")
    }

}