package org.example

/*
*
*
    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
*
* */
fun romanToInt(s: String): Int {
    val hashMap = hashMapOf<String, Int>(
        "I" to 1,
        "IV" to 4,
        "IX" to 9,
        "XL" to 40,
        "XC" to 90,
        "CD" to 400,
        "CM" to 900,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )

    var sum = 0
    var i = 0
    while (i < s.length) {
        val key =
            if (i + 1 < s.length && hashMap.getOrDefault(s.substring(i, i + 2), -1) != -1) {
                val k = s.substring(i, i + 2)
                i += 2
                k
            } else {
                val k = s[i]
                i++
                k
            }
        val result = hashMap.getOrDefault(key.toString(), 0)
        sum += result
    }

    return sum
}

fun main() {
    println(romanToInt("III"))
}