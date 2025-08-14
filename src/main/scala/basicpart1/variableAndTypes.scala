package basicpart1 



object VariableAndTypes extends App {
    val x: Int = 42

    println(x)

    // VALS ARE IMMUTABLE 

    // COMPILER CAN INFER TYPES

    val aString: String = "hello"; val anotherString = "Goodbye!"

    val aBoolean: Boolean = true // false 
    val aChar: Char = 'a'
    val anInt: Int = x
    val aShort: Short = 1234
    val aLong: Long = 235654322133577655L
    val aFloat: Float = 2.0f
    val aDouble: Double = 3.14

    // variables 
    var aVariable: Int = 4
    aVariable = 5 // side Effects

}