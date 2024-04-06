package org.example

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = hashMapOf<Int, Int>()
        nums.forEachIndexed { i, num ->
            val complement = target - num // 7
            if(hashMap.containsKey(complement)) {
                println("$num ${hashMap[complement]}")
                hashMap[complement]?.let {
                    return intArrayOf(it, i)
                }
            }
            hashMap[num] = i // 7, 0
        }
        return intArrayOf()
    }

}

/*
* target = 9
* array 7, 2, 11, 15
*
* 9 - 7 = 2
* map[9 - 7] = map[2] = 0
* map[9 - 2] = map[7] = 1
* map[9 - 11] = map[-2] = 2
* map[9 - 15] = map[-6] = 3
* */

fun main() {
    println(TwoSum().twoSum(intArrayOf(7, 2, 11, 15), 9).toList())
}