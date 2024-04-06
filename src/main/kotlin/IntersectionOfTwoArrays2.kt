package org.example

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val counts = HashMap<Int, Int>()
    // 첫 번째 배열의 요소별 출현 횟수를 카운트
    for (num in nums1) {
        counts[num] = counts.getOrDefault(num, 0) + 1
    }

    val intersection = mutableListOf<Int>()
    // 두 번째 배열을 순회하며 교집합 찾기
    for (num in nums2) {
        if (counts.getOrDefault(num, 0) > 0) {
            intersection.add(num)
            counts[num] = counts[num]!! - 1
        }
    }

    return intersection.toIntArray()
}

fun main() {
    intersect(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))
}