package org.example

import java.util.PriorityQueue

fun topKFrequent(nums: IntArray, k: Int): IntArray {

    val frequencyMap = mutableMapOf<Int, Int>()

    for (num in nums) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }

    val pq: PriorityQueue<IntArray> = PriorityQueue { p1: IntArray, p2: IntArray ->
        p2[1] - p1[1]
    }

    for(elem in frequencyMap.keys) {
        pq.add(intArrayOf(elem, frequencyMap[elem]!!))
    }

    val result = IntArray(k)
    for(i in 0 until k) {
        result[i] = pq.poll()[0]
    }

    return result
}