fun main() {
    // To find the value of the largest number in an array

    fun main(args: Arrayy<String>)
    {
        val randomArray = doubleArrayOf(1.2,1.3,1.3,1.5,1.6,5.6,7.9,1,56.65)
        var a = 1 //this will act as the index

        for (a < randomArray.size - 1)
        {
            if (randomArray[a] < randomArray[a-1])
            {
                var largestNumber:Double = randomArray[a-1]
            }
                a++
        }

        println("The largest number in the array is $largestNumber")

    }
}