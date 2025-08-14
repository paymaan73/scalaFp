package basicpart1 


object StringOps extends App {
    val aString: String = "Hello, I'm learning scala."

    println(aString.charAt(2))
    println(aString.substring(7, 11))
    println(aString.split(" ").toList)
    println(aString.startsWith("Hello"))
    println(aString.replace(",", "\n"))
    println(aString.toLowerCase)
    println(aString.toUpperCase)
    println(aString.length)

    val aNumberString = "45"
    val aNumber = aNumberString.toInt

    println('a' +: aNumberString :+ 'z')


    println(aString.reverse)
    println(aString.take(2))

    // Scala-specific : String interpolators

    // S-interpolators 
    val name = "David"
    val age = 12
    val greeting = s"hello, my name is $name and i am $age years old."
    val anotherGreeting = s"hello, my name is $name and i am ${age + 1} years old."

    // F-interpolators 
    val speed = 1.2f
    val myth = f"$name%s can eat $speed%2.2f per minute."
    println(myth)

    // Raw-interpolators 

    println(raw"This is a \n newLine")
    val escaped = "This is a \n newLine."
    println(escaped)
    println(raw"$escaped")

}