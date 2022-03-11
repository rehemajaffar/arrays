fun main(){
    town()
    places()
    numbers()
   var x= names(arrayOf("Rehema","Juma","Asia","Jaffar"))
    println(x)


}
fun town(){
    var county = arrayOf("Nakuru","Nairobi","Kisumu","Nyeri")
    println(county.contentToString())
}
fun places(){
    var cities= arrayOf("harrare","mumbai","dodoma","jakarta")
    cities.sortedArray().forEach { x->
        println(x.capitalize()) }
    }
fun numbers(){
    var long= arrayOf(17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=long[1]+long[2]
    var index =long.indexOf(158)
    var asending= long.sorted()
    println(sum)
    println(index)
    println(asending)
}
fun names(names: Array<String>):Array<String>{
    var name=names.contentToString()
    return names
}