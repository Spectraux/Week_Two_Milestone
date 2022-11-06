fun main() {
    // code to find average of numbers in an array
    val dataArray = doubleArray(3.4,5.6,7.0,8.9,7.6) //created new array
    //To find average, we need the sum and sample data size.

    //To find sum
    var a = 0 //to be used as index of array
    var sum : Double = 0.0
    for(a < dataArray.size-1)
    {
        sum += dataArray[a]

        a ++
    }

    //Sample data size can easily be gotten
    val sampleDataSize : Double = dataArray.size

    var average : Double = sum / sampleDataSize
    println("The average of the numbers in the array is $average")

}