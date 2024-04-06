package org.example

import kotlin.math.pow

class HappyNumber {
//    fun isHappy(n: Int): Boolean {
//
//        var result = false
//        val hashMap = hashMapOf<Int, Boolean>()
//
//        fun recursive(m: Int) {
//            if(m == 1) {
//                result = true
//                return
//            }
//            val arr = m.toString().split("")
//            var sum = 0
//            arr.forEach {
//                val value = it.toDoubleOrNull() ?: 0.0
//                sum += value.pow(2).toInt()
//            }
//            if(hashMap[sum] == true) return
//            hashMap[sum] = true
//            recursive(sum)
//        }
//
//        recursive(n)
//        return result
//
//    }

    fun isHappy(n: Int): Boolean {

        fun getSum(num: Int): Int {
            var sum = 0
            var number = num
            while (number > 0) {
                val digit = number % 10
                sum += digit * digit
                number /= 10
            }
            return sum
        }

        var slow = n
        var fast = getSum(n)

        while (fast != 1 && slow != fast) {
            slow = getSum(slow)
            fast = getSum(getSum(fast))
        }

        return fast == 1
    }

}

fun main() {
    HappyNumber().isHappy(19)
}