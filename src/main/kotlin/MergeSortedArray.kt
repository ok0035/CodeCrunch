package org.example

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

    var curIdx = m
    for (i in nums2.indices) {
        nums1[curIdx] = nums2[i]
        curIdx++
    }
    nums1.sort()
}