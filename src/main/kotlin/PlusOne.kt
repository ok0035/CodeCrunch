package org.example

import java.util.*

class PlusOne {
//    fun plusOne(digits: IntArray): IntArray {
//
//        var plus = 0
//        var curIdx = digits.lastIndex
//
//        digits[digits.lastIndex] = digits.last() + 1
//
//        val stack : Deque<Int> = LinkedList()
//        while (curIdx >= 0) {
//            val num = digits[curIdx] + plus
//            stack.push(num % 10)
//            plus = num / 10
//            if(plus > 0 && curIdx == 0) stack.push(plus)
//            curIdx--
//        }
//
//        return stack.toIntArray()
//    }

    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.indices.reversed()) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            digits[i] = 0
        }
        val newDigits = IntArray(digits.size + 1)
        newDigits[0] = 1
        return newDigits
    }

}

fun main() {
    println(PlusOne().plusOne(intArrayOf(1,2,3)).toList())
}