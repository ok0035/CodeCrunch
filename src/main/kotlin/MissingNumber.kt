package org.example

//fun missingNumber(nums: IntArray) : Int {
//
//    var start = 0
//    var end = nums.lastIndex
//    var startValue = 0
//    val sortedArray = nums.sorted()
//    var endValue = sortedArray.last()
//
//    while(true) {
//        if (start > nums.lastIndex || sortedArray[start] != startValue)
//            return startValue
//
//        if (sortedArray[end] != endValue) return endValue
//        startValue++
//        endValue--
//        start++
//        end--
//    }
//
//}

fun missingNumber(nums: IntArray): Int {

    val n = nums.size
    val sumOfNums = n * (n + 1) / 2
    val arraySum = nums.sum()

    return sumOfNums - arraySum

}

fun main() {
    println(missingNumber(intArrayOf(0, 1)))
}