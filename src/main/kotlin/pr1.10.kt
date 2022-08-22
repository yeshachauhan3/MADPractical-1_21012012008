//10. Write Different types of Class & Constructor. Create a class Car and set various members like type, model, price, owner. add the function getCarPrice in it. Create an object of Car class and access property of it. (getCarInformation(), getOriginalCarPrice(), getCurrentCarPrice(), displayCarInfo() etc.)
class Car(type:String, model:String, price:Int, owner:String, miles:Int){

    var typee:String = type
    var modell =model
    var pricee:Int = price
    var ownerr = owner
    var miless:Int = miles
    fun getCarInfo() {
        println("Selling Price of Car: " + (pricee - miless).toString() + "rs")
        println("Actual price: " + pricee.toString() + "rs")
        println("Total Kms: " + miless.toString())
        println("car model:" + modell.toString())
        println("car owner: " + ownerr.toString())
        println("car miles: " + miless.toString())
        println()

    }
    fun getOriginalCarPrice() {
        println("Actual price: " + pricee.toString() + "rs")
        println()

    }
}
fun main() {
    var c1 = Car("SUV", "Polo", 125000, "Husain", 10000)
    c1.getCarInfo()
    var c2 = Car(" SUV", "Baleno", 100000, "Hitesh", 50000)
    c2.getCarInfo()
    println("------------------------------------------------")
    c1.getOriginalCarPrice()
    c2.getOriginalCarPrice()
}