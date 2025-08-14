package basicpart1 

object CbnVsCbv extends App {

    def calledByValue(x: Long): Unit = {
        println("by value " + x)
        println("by value " + x)
    }


    def calledByName(x: => Long): Unit = {
        println("by value " + x)
        println("by value " + x)
    }

    calledByValue(System.nanoTime())
    calledByName(System.nanoTime())


    def infinite(): Int = 1 + infinite()

    def printFirst(x: Int, y: => Int) = println(x)

    printFirst(12, infinite())
    //printFirst(infinite(), 21) // Error stackoverflow
}