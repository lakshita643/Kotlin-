/*class person(){
    val name:String=""
    var age:Int=0
}
fun main(){
    var person=person()//create object
    println(person.age)
    println(person.name)
    var person2=person()
    //is type ki wajah se ham property ko defalt value nhi de pa rhe he to ise change krna padega.
    // this is a Secondary Constructo.
    println(person2.age)
    println(person2.name)
}*/
//to ab shi code
class person(nameParam:String,ageParam:Int){
    val name:String=nameParam
    val age:Int=ageParam
}//is type se code krne se ham parameters ki value ke sath operation perform kr skte he.
fun main(){
    var person=person(nameParam="Lavi",ageParam=23)
    println(person.age)
    println(person.name)
}