package org.example

fun main() {

    var result: List<Int> = listOf()

}

fun productExceptSelf(nums: IntArray): IntArray {

    /*
    * 나눗셈을 하지 않고 O(n)에 풀이하기
    * input -> [1, 3, 5, 7]
    * output -> [105, 35, 21, 15]
    * result -> 3*5*7, 1*5*7, 1*3*7, 1*3*5
    * */

    val result = IntArray(nums.size)
    var p = 1

    for (i in nums.indices) {
        result[i] = p
        p *= nums[i]
    }

    p = 1
    for(i in nums.indices.reversed()) {
        result[i] *= p
        p *= nums[i]
    }

    return result
}