//5.Display month name using When
fun main(){
    print("Enter Month Number:")
    val a= readLine()!!.toInt()
    println(
        when (a){
            1-> {"January"}
            2->{"February"}
            3->{"March"}
            4->{"April"}
            5->{"May"}
            6->{"June"}
            7->{"July"}
            8->{"August"}
            9->{"September"}
            10->{"October"}
            11->{"November"}
            12->{"December"}
            else->{"Enter the proper number"}
        }
    )

}