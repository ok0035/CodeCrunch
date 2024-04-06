package org.example

import kotlin.math.pow

fun titleToNumber(columnTitle: String): Int {

    var sum = 0
    columnTitle.forEach { c ->
        sum = (sum * 26) + (c - 'A' + 1)
    }

    return sum

}

fun main() {
    println(titleToNumber("FXSHRXW"))
}