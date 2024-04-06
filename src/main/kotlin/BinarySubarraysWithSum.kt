package org.example

/*
* 합이 goal이 되는 누적합 구하기*/
fun numSubarraysWithSum(nums: IntArray, goal: Int): Int {

    val sumCount = mutableMapOf<Int, Int>()
    sumCount[0] = 1
    var sum = 0
    var result = 0

    nums.forEach { num ->
        sum += num
        result += sumCount.getOrDefault(sum-goal, 0)
        sumCount[sum] = sumCount.getOrDefault(sum, 0) + 1
    }
    return result
}