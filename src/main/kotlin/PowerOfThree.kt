package org.example

class PowerOfThree {

    //n이 3의 제곱수여야함
    fun isPowerOfThree(n: Int): Boolean {
        var num = n
        if(n == 0) return false
        while(num != 1) {
            val isThree = num % 3
            if(isThree != 0) return false
            num /= 3
            println(num)
        }
        return true
    }
}

fun main() {
    println(PowerOfThree().isPowerOfThree(0))
}