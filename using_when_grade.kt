fun main(){
    print("Enter your marks:")
    val marks=readLine()!!.toDouble()
    when{
        marks>=90->println("Well Done!\nYour grade is A")
        marks>=75->println("Very Good!\nYour grade is B")
        marks>=50->println("Good Imrove it!\nyour grade is C")
        else->println("Do Workhard!\nYou are Fail")
    }
}