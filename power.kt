import kotlin.math.pow
fun main(){
    var fn=::power//:: it is a function reference.
    //*"power function ka reference (address) fn variable me store karo."
    //Jaise:var x = 10me value store hoti hai.
    //Waise hi: var fn = ::power me function store ho raha hai. *//
    
    println(fn(2.0,3.0))
}
fun power(a:Double,b:Double):Double
{
    return a.pow(b)
}