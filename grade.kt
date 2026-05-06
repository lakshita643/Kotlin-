fun main(){
    print("Enter your marks:")
    var marks=readLine()!!.toDouble()
    if(marks>=90){
        println("Your grade is A!")
    }else if(marks>=75){
        println("Your grade is B!")
    }else if(marks >=50){
        println("Your grade is C!")
    }else{
        println("You are Fail!")
    }

}
