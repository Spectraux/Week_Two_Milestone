fun main() {
    //code to add complex numbers by passing a class to a function

    class complexNumber(internal var real: int, internal var imaginary: int)

    fun main(args: Array<String>)
    {
        val a = complexNumber(2,4)
        val b = complexNumber(1,6)
        val temp : complexNumber
        temp = add(a,b)
        println("sum of the complex numbers is ${temp.real} + ${temp.imaginary}")
    }

    fun addComplexNumbers(a:complexNumber, b:complexNumber):complexNumber
    {
        val temp = complexNumber(0,0)

        temp.real = a.real + b.real
        temp.imaginary = a.imaginary + b.imaginary

        return temp
    }
}