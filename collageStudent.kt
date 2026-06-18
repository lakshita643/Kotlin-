class CollageStudents(var name:String,var course:String,var semester:Int){
    constructor(name:String,course:String)
    :this(name,course,1)
    fun display(){
        println("Name of the student : $name")
        println("Course : $course")
        println("Semester : $semester")
    }
}
fun main(){
    print("Enter Student Name : ")
    var name1=readLine()!!
    print("Enter Course : ")
    var course1=readLine()!!
    print("Enter Semeter : ")
    var semester1=readLine()!!.toInt()
    var CollageStudents1=CollageStudents(name1,course1,semester1)
    var CollageStudents2=CollageStudents(name1,course1)
    CollageStudents1.display()
    CollageStudents2.display()
}