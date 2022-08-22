//.Find the factorial of number by recursion. Explain "tailrec" keyword
fun main() {
    println("Enter number:")
    var number: Int = readLine()!!.toInt()
    val factorial = fact(number)
    println("Factorial of $number = $factorial")
    println("by tailrec keyword,factorial of 5 is $number=$factorial")
}
tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}