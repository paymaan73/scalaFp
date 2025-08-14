package basicpart1




object Function extends App {
    def aFunction(a: String, b: Int): String  =
        a + " " + b

    println(aFunction("John", 3))

    def aParameterlessFunction(): Int = 42 
    println(aParameterlessFunction())
    println(aParameterlessFunction)


    def aRepeatedFunction(aString: String, n: Int): String = {
        if (n == 1) aString
        else aString + aRepeatedFunction(aString = aString, n - 1)
    }

    println(aRepeatedFunction("Hello", 3))

    // WHEN YOU NEED LOOPS, USE RECURSION


    def aFunctionWithSideEffect(aString: String): Unit = println(s"This is a function with side effect and with parameter a string is ${aString}")

    aFunctionWithSideEffect(aString = "Check")


    def aBeegFunction(n: Int): Int = {
        def aSmallerFunction(a: Int, b: Int): Int = a + b

        aSmallerFunction(n, n - 1)
    }

    /* 
    1. A greeting a function (name, age) => "Hi my name is $name and I'm $age years old."
    2. Factorial function 1 * 2 * 3 * 4 * 5 * n
    3. A Fibonacci function 
       f(1) = 1
       f(2) = 2
       f(3) = 3
       f(n) = f(n - 1) + f(n - 2)
    4. Tests if a number is prime
     */


    def greetingForKids(name: String, age: Int): String = 
        "Hi my name is " + name + " and i'm " + age + " years old."

    println(greetingForKids("John", 29))


    def factorial(n: Int): Int = 
        if (n <= 0) 1
        else
            n * factorial(n - 1)

// /*
//    println(factorial(4))
//     4 * f(3) = 24
//     3 * f(2) = 6
//     2 * f(1) = 2
//     1 * f(0) = 1 
//     1
// /*

    def fibonacci(n: Int): Int = {
        if (n <= 2) 1
        else 
            fibonacci(n - 1) + fibonacci(n - 2)
    }

    /*
    println(fibonacci(8))
    //1 1 2 3 5 8 13 21
     */

    def isPrime(n: Int): Boolean = {
        def isPrimeUntil(t: Int): Boolean = 
            if (t <= 1) true 
            else n % t != 0 && isPrimeUntil(t-1)
        
        isPrimeUntil(n / 2)
    }

    println(isPrime(37))

}