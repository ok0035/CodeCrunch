package org.example

/*
* i % 3 && i % 5 -> FizzBuzz
* i % 3 -> Fizz
*
* */
fun fizzBuzz(n: Int): List<String> {
    val result: MutableList<String> = mutableListOf()
    for (i in 1..n) {
        result.add(
            if (i % 3 == 0 && i % 5 == 0) "FizzBuzz"
            else if (i % 3 == 0) "Fizz"
            else if (i % 5 == 0) "Buzz"
            else i.toString()
        )
    }
    return result.toList()
}