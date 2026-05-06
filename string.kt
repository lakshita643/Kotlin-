fun main(){
    var txt1="Hello World!"
    println(txt1[0])
                    //in dono line se 0 or 2 index pe jo charecter hoga wo output me aaega.
    println(txt1[2])
    println("The length of the txt string is:."+txt1.length)// puri string ki length find krne ke liye
    println(txt1.uppercase())// string are change into capital letter
    println(txt1.lowercase())// string are change into small letter
    var txt2="Hello World!"
    var txt3="Hello Lavi!"
    println(txt1.compareTo(txt2))
                               //do string ka comparison ho rha he isme
    println(txt2.compareTo(txt3))
    var firstName="Lakshita"
    var lastName="Joshi"
    println(firstName +" "+ lastName)//conect two string
    println(firstName.plus(lastName))//plus function ka use kr ke bhi do string ko conect kr skte he

}