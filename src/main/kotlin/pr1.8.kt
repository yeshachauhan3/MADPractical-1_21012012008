fun main() {

    println("arrayOf() Method : ")
    val a1 = arrayOf(56, 40, 60, 30, 10)
    println(a1.contentToString())

    println("Array<>() : ")
    val a2 = Array(5) { 0 }
    println(a2.contentToString())

    println("Array<>() and lambda function : ")
    val a3 = Array(8) { i -> i }
    println(a3.contentToString())

    println("IntArray() : ")
    val a4 = IntArray(5)
    println(a4.joinToString(", "))

    println("intArrayOf() : ")
    val a5 = intArrayOf(13, 6, 13, 12, 90, 34)
    println(a5.joinToString(", "))

    println("2-D Array using arrayOf() & intArrayOf() : ")
    val a6 = arrayOf(intArrayOf(1, 3), intArrayOf(4, 5), intArrayOf(6, 7))
    println(a6.contentDeepToString())

    print("Enter the number of Elements : ")
    val size: Int = readLine()!!.toInt()
    val a7 = IntArray(size) { 0 }

    for (i in 0 until size) {
        print("Enter the Element : ")
        a7[i] = readLine()!!.toInt()
    }

    println("\nEntered Array : ")
    println(a7.contentToString())

    println("-------With In-Built Function-------")
    println("in-built Function : ")
    a7.sort()
    println(a7.contentToString())

    val a8 = intArrayOf(34, 78, 12, 0, 89, 45, -23, -67, -999, 980)
    println("-------Without In-Built Function-------")
    println("without in-built Function : ")
    println(a8.contentToString())

    var temp: Int
    for (i in a8.indices) {
        for (j in a8.indices) {
            if (a8[j] > a8[i]) {
                temp = a8[j]
                a8[j] = a8[i]
                a8[i] = temp
            }
        }
    }
    println("without in-built Function : ")
    println(a8.contentToString())
}
