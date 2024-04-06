package org.example

fun mySqrt(x: Int): Int {
    if(x < 2) return x

    var start = 0
    var end = x
    var mid = x/2

    while(start < end && start != mid && end != mid) {
        if(mid.toLong() * mid > x) {
            end = mid
        } else if (mid.toLong() * mid < x) {
            start = mid
        } else return mid

        mid = start + (end - start)/2
    }

    return mid
}

fun main() {
    println(mySqrt(3))
}