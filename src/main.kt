import java.util.Arrays

fun main(){
    name("codehive")
    var x = modulus(25,3)
    println(x)
    var y = nameage("Catherine",20)
    println(y)
    var z = length("Akirachix")
    println(z)

}
fun name(num:String){
    var x =num[4].toString()+num[5]+num[6]+num[7]
    println(x)
}
fun modulus(a:Int,b:Int):Int{
    var y = a%b
    return y
}
fun nameage(name:String,age:Int):String{
    var x = "Hi my name is $name and i am $age years old"
    return x
}
fun length(name:String):Int{
    var size = name.length
    return size

}


