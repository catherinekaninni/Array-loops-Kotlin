fun main(){
    var product = numbers(arrayOf(3,5,8,))
    println(product)
    var total = mixedtype(arrayOf("Catherine",50,54.0,true,40,39.0F,))
    println(total)
    var y = vowel(arrayOf('a','b','c','d','e','f'))
    println(y)


}
fun numbers(number:Array<Int>):Int{
    var product = 1
    number.forEach { num->
        product*=num
    }
    return product
}
fun mixedtype(mixedArray: Array<Any>):Number{
    var sum = 0.0
    mixedArray.forEach { number ->
        if (number is Double|| number is Float) {
            sum += number.toString().toDouble()
        }
    }
    return sum
}
fun vowel(number: Array<Char>):Int{
    var count = 0
    number.forEach { num->
        if (num == 'a'||num=='e'||num=='i'||num=='o'||num=='u'){
            ++count
    }

    }
   return count
}


