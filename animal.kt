class Animal(){
    fun eat(){
        println("Animal is eating.")

    }
    fun sleep(){
        println("Animal is sleeping.")
    }
}
fun main(){
    var cat=Animal()
    var dog=Animal()
    var cow=Animal()
    println("Cat : ")
    cat.eat()
    cat.sleep()
    println("Dog : ")
    dog.eat()
    dog.sleep()
    println("Cow : ")
    cow.eat()
    cow.sleep()
}