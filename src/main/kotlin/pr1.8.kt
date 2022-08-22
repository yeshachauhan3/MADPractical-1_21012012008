//.Create different types of Array as shown in image. Explore Arrays.deepToString(), contentDeepToString() methods, IntArray variable .joinToString()  and use in program to print Array. Explore range, downTo, until etc. for loop and use in this program. Sort Array of Integer data type without using inbuilt function & with using inbuilt function
import java.util.Arrays
import java.util.*
fun main() {
    println("Create Array-1 using arrayof() method")
    val a1 = arrayOf(1, 2, 3, 4)
    print("[")
    a1.forEach { print(" $it ") }
    print("]\n")

    println("create Array-2 using array<>()")
    val a2 = arrayOf<Int>(1, 2, 3)
    print("[")
    a2.forEach { print(" $it ") }
    print("]\n")
    print("[")
    println("create Array-3 using array<>() and lambda function")
    val a3 = Array(5, { i -> i * 1 })
    a3.forEach { print(" $it ") }
    print("]\n")
    println("create Array-4 using Intarrayof()")
    print("[")
    val a4 = intArrayOf(1, 2, 3, 4)
    for (i in 0..a4.size-1)
    {
        print(" ${a4[i]} ")
    }
    print("]\n")
    println("create Array-5 using Intarray()")
    print("[")
    val a5 = IntArray(5) { 10 * (it + 1) }
    for (i in 0..a5.size-1)
    {
        print(" ${a5[i]} ")
    }
    print("]\n")
    println("create 2-D Array-6 by using arrayof() and intarrayof()")
    val a6 = arrayOf(intArrayOf(1, 2),intArrayOf(3, 4),intArrayOf(5, 6, 7))
    println(Arrays.deepToString(a6))
    println("---Please Enter Array Values----")
    print("Size:-")
    val size = readLine()!!.toInt()
    var a7 = Array<Int>(size) { readLine()!!.toInt() }
    println("---Entered values---")
    print("[ ")
    print(a7.joinToString())
    print(" ]\n")
    println("************With Built-in Function*************")
    println("**********After sorting by built-in function**********")
    a7.sort()
    print("[ ")
    print(a7.joinToString())
    print(" ]\n")
    println("************without built-in function**********")
    println("***********After Sorting**********")
    var temp = 0
    for (i in 0..a7.size-1) {
        for (j in i+1..a7.size-1)
        {
            if (a7[i] > a7[j])
            {
                temp = a7[i];
                a7[i] = a7[j];
                a7[j] = temp;
            }
        }
    }
    print("[ ")
    print(a7.joinToString())
    print(" ]\n")
}