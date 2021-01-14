fun main(args: Array<String>) {
    println("Enter your name")
    val name = readLine()
    println("enter your age now")
    val age = readLine()!!.toInt()
    println("Finally enter your weight")
    val weight = readLine()!!.toDouble()
    println("****PRINTED DATA****")
    println("Your name is $name your age is $age and your weight is $weight")
}