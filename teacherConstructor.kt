class Teacher(var name:String,var subject:String,var experience:Int){
    constructor(name:String,subject:String)
    :this(name,subject,0)
    fun showInfo(){
        println("Teacher Name is : $name")
        println("Subject Name is : $subject")
        println("Experience is : $experience")
    }
}
fun main(){
    print("Enter Teacher Name : ")
    var Name=readLine()!!
    print("Enter Subject Name : ")
    var Subject=readLine()!!
    print("Enter Experience : ")
    var Experience=readLine()!!.toInt()
    var teacher1=Teacher(Name,Subject,Experience)
    teacher1.showInfo()
    var teacher2=Teacher(Name,Subject)
    teacher2.showInfo()
}