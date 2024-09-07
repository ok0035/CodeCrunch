package org.example

fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.lastIndex
    var max = 0

    while(left < right) {
        val c = minOf(height[left], height[right]) * (right - left)
        if(c > max) max = c

        if(height[left] < height[right]) {
            left++
        } else {
            right--
        }
    }

    return max
}

fun main() {
    val array = intArrayOf(
        1,8,6,2,5,4,8,3,7
    )

    print("정답 -> ${maxArea(array)}")
}