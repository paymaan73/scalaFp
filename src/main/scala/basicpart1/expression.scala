package basicpart1 




object Expression extends App {
    val name = "Pat Cook"
    val value = 42 
    val age = 29

    val t = (1, 2.7, "Hi there")
    val (a, b, c) = t 
    println(t._1)

    val message = name + " is " + (age+1) + " years old."
    val message2 = s"$name is ${age+1} years old."
    value.+(age)

    val aStringBlock: String = {
        println("check")
        "String"
    }

    value == age

    if(true)
    true
    else 
        true
}