fun main(){
    val fruit=arrayOf("Apple", "Banana", "Mango", "Orange")
    println(fruit.joinToString())
    val numbers=arrayOf(2, 4, 6,8)
    println(numbers.joinToString())
    println(fruit[3])//access the element of an array
    println(numbers[2])//access the element of an array
    //println(fruit[4])//it is an error because it is a out of bound
    fruit[0]="Grapes"//change an array element
    println(fruit.joinToString())
    println(fruit.size)//array length
    println(numbers.size)//array length
    if("Banana" in fruit){
        println("It is exists!")
    }
    else{
        println("It is not exists!s")
    }
    if(9 in numbers){
        println("It is exists!")
    }
    else{
        println("It is not exists!")
    }

}