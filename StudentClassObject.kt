class student(val Name:String,var Course:String,var RollNo:Int,var Subject:String,){
    fun S_data(){
         println("Name:$Name")
         println("Class:$Course")
         println("RollNo:$RollNo")
        println("Subject:$Subject")
    }

}/*Normal class_object bnaya he or function ko  object_se call kr ke value print krwai he */
fun main(){
    print("Enter Name of the Student:")
    var name=readLine()!!
    print("Enter the course of the Student:")
    var course=readLine()!!
    print("Enter the roll numberof the student:")
    var rollNo=readLine()!!.toInt()
    print("Enter the subject of the student:")
    var subject=readLine()!!
    var student1=student(name,course,rollNo,subject)
    student1.S_data() 
}