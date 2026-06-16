class Employee(var name:String,var salary:Int){//primary constructor jo peranthasis() me likha he wo hi he. 
                   //properties lowercase se start krni chahiye hamesha.
    fun displayInfo(){
        println("Employee Name is : $name")
        println("Employee Salary is : $salary")
    }


}
fun main(){
    print("Enter Nmae of the employee: ")
    var Name=readLine()!!
    print("Enter Salary of the employee: ")
    var Salary=readLine()!!.toInt()
    var mx=Employee(Name,Salary)//yha apne aap constructor call ho rha he jb object bana.
    mx.displyaInfo()
}