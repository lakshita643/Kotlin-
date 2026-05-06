fun main(){
    print("Enter First Number:")
    val a=readLine()!!.toDouble()
    print("Enter Second Number:")
    val b=readLine()!!.toDouble()
    println("Choose Any!\n1.Addition\n2.Substraction\n3.Multipliction\n4.Division")
    var choose=readLine()!!.toInt()
    when{
        choose==1->println("Addition of two numbers is:${a+b}")
        choose==2->println("Substraction of two numbers is:${a-b}")
        choose==3->println("Multiplication of two numbers is:${a*b}")
        choose==4->println("Division of two numbers is:${a/b}")
    }

}