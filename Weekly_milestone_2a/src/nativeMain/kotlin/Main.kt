fun main() {
    //Code to swap two numbers
    var a = 3
    var b = 54

    a = b.also{b=a}
    println(a)
    println(b)
}