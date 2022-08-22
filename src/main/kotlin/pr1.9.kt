//9.Find the max number from ArrayList.
fun findmax(a:Array<Int>) {
    var max = a[0]
    var count = 0
    for (i in a) {
        println("ar[$count] = $i")
        if (i > max) {
            max = i
        }
        count++
    }
    println("largest number is:")
    println(max)
}
fun main()
{
    var a = arrayOf(57, 90, 10, 13, 5, 14)
    findmax(a)

}