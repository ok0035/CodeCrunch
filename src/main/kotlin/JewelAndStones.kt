package org.example

fun main() {
    numJewelsInStones("aA", "aAAbbbb")
}

fun numJewelsInStones(jewels: String, stones: String): Int {
    val jewelCounter = mutableMapOf<Char, Boolean>()
    jewels.forEach {
        println(it)
        jewelCounter[it] = true
    }

    var sum = 0
    stones.forEach {
        jewelCounter.getOrDefault(it, false)
        val isJewel = jewelCounter[it]
        if(isJewel == true) {
            sum ++
        }
    }
    return sum
}