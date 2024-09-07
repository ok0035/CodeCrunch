package org.example

import kotlin.math.abs

fun equalSubstring(s: String, t: String, maxCost: Int): Int {

    var maxLength = 0
    var windowSum = 0
    var left = 0

    for(i in s.indices) {
        val cost = abs(s[i] - t[i])

        windowSum += cost
        while(windowSum > maxCost) {
            windowSum -= abs(s[left] - t[left])
            left++
        }
        maxLength = maxOf(maxLength, i - left + 1)
    }

    return maxLength
}

fun main() {
    println(equalSubstring("abcd", "bcdf", 3))
}