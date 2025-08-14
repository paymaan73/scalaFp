package basicpart1 

object DefaultArgs extends App {
    def trFact(n: Int, acc: Int = 1): Int = {
        if (n <= 1) acc 
        else trFact(n - 1, n * acc)
    }

    val fact10 = trFact(10)


    def savePicture(format: String = "jpg", width: Int = 800, height: Int = 600): Unit = println("saving picture.")

    savePicture()
    savePicture("png")


    /*
    savePicture(1200) // error 
    solutions:
        1. pass in every loading argument
        2. name the arguments



     */

    savePicture(width = 1200)


    savePicture(width = 1200, height = 800, format = "bitmap")
}