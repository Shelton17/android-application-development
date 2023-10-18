fun main() {
    //first line of code in kotlin
    //println("Hello World!")

    //variables use var
    var x: Int = 3
    println("The value of x is: $x")
    x = 5
    println("The value of x is: $x")

    //constants use val
    val y = 4
    println("The vale of y is =: $y")

    //data types
    val whole_number = 3
    val big_number = 3L
    val decimal_number = 3.33
    val i_love_veggies = false
    val i_love_pizza = true
    val i_am_letter = 'a'

    //arithmetic operators
    var z = 3 * 4
    println("The vale of z is z: $z")
    z = 3 - 4
    println("The vale of z is z: $z")
    z = 3 + 4
    println("The vale of z is z: $z")
    z = 3 / 4
    println("The vale of z is z: $z")
    z = 3 % 4
    println("The vale of z is z: $z")

    //logical operators
    val adult = true
    val programmer = true
    var adult_programmer = (adult == programmer)
    println(adult_programmer)
    adult_programmer = (adult != programmer)
    println(adult_programmer)
    adult_programmer = (adult || programmer)
    println(adult_programmer)

    //strings
    val test_string = "I am new to Kotlin"
    println(test_string)
    println(message = test_string. run { toUpperCase() })

    //conditions
    val b = 1 + 1
    if (b == 2){
        println("b is 2")
    } else if (b == 3){
        println("b is 3")
    } else {
        println("b is not 2 or 3")
    }

    //if conditions in kotlin can be used as expressions
    val test_v = if (b == 2) 2 else 3
    println("Value of test_v is: $test_v")

    //setting a nullable variable
    val  null_val: Int? = null
    val number_1 = readLine() ?: "0"
    val number_2 = readLine() ?: "0"
    val result = number_1.toInt() + number_2.toInt()
    println(result)

    //lists
    //this is an immutable list
    val shopping_list = listOf<String>("Lamorghini", "Penthouse", "Rolex")
    println(shopping_list[0])
    println(shopping_list[2])

    //this is a changable or mutable list
    val mutable_shopping_list = mutableListOf("Lamorghini", "Penthouse", "Rolex")
    mutable_shopping_list.add("Ferrari")
    println(mutable_shopping_list[3])

    //while looping
    println("Start of While Loop")
    var counter = 0
    while (counter < mutable_shopping_list.size){
        println(mutable_shopping_list[counter])
        counter++
    }

    //for looping
    for (i in mutable_shopping_list){
        println(i)
    }

    //when
    val test_x = 3
    when (x){
        in 1..2 -> println("x is between 1 and 2")
        in 3..10 -> println("x is between 3 and 10")
        else -> {
            println("x is not in the range 1 to 10")
        }
    }

    print_10_numbers()
    val boolean_result = is_even(25)
    println(boolean_result)

    val test_function = 10
    println(test_function.is_odd())
}

//functions
fun print_10_numbers(){
    for (i in 1..10){
        println(i)
    }
}

//there can be default parameters in functions
fun is_even(number: Int = 10): Boolean{
    if (number % 2 == 0){
        return true
    } else{
        return false
    }
}

//expression functions
fun Int.is_odd(): Boolean{
    return this % 2 == 1
}