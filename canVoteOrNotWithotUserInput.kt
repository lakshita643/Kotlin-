class person(val name:String,var age:Int){
    fun canVote():Boolean{
        if(age>18){
            println("You can Vote!")
            return true

        }
        else{
            println("You can't Vote!")
        }
        return false
        
    }
}
fun main(){
    val p1=person(name="Lavi",age=16)
    var p2=person(name="Ankki",age=24)
    println(p1.canVote())
    println(p2.canVote())

}