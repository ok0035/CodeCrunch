package org.example

fun containsDuplicate(nums: IntArray): Boolean {

    val hashMap = hashMapOf<Int, Int>()

    nums.forEach {
        hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        if(hashMap[it] == 2) return true
    }

    return false
}

fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 1)))
}