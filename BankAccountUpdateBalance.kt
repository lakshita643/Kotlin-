class BankAccount(val accountHolder:String,var balance:Double){
    fun deposite(){
        print("Enter Deposite Amount : ")
        var depositeAmount=readLine()!!.toInt()
        balance=balance+depositeAmount
        println("After Deposite Ammount Total Balance is : $balance")
    }
    fun withdraw(){
        print("Enter Withdraw Amount : ")
        var withdrawAmount=readLine()!!.toInt()
        if(withdrawAmount<=balance){
             balance=balance-withdrawAmount
             println("After Withdraw Amount Total Balance is : $balance")
            }
            else{
                println("Insufficient Balance!")
            }
       
    }
    
}
fun main(){
    print("Enter Account holder name : ")
    var accountHolder1=readLine()!!
    print("Enter Total Balance : ")
    var balance1=readLine()!!.toDouble()
    
    print("What you Need \n1. Deposite \n2.Withdraw \n")
    var option=readLine()!!.toInt()
    var BankAccount1=BankAccount(accountHolder1,balance1)
    if(option==1){
        BankAccount1.deposite()
    }
    else{
        BankAccount1.withdraw()
    }

}