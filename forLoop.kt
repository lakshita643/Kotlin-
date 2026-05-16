fun main(){
    println("1 to 5 numbers.")
    for(i in 1..5){//iska use krke 1 se 5 tk ke numbers print krwa skte he
        println(i)
    }
    println("1 to 5 numbers two steps chhod ke")
    for(i in 1..5 step 2){//step ka use kr ke ham kitne bhi step chhod ke number print krwa skte he
        println(i)
    }
    println("10 to 1 numbers.")
    for(i in 10 downTo 1){//downTo ka use kr ke ham last se number print krwa skte he
        println(i)
    }
    println("10 to 1 numbers two steps chhod ke")
    for(i in 10 downTo 1){//isme ham last se bhi two step chhod ke number print krwa skte he
        println(i)
    }
}