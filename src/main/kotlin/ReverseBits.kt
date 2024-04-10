package org.example

fun reverseBits(n:Int): Int {
    var input = n
    var result = 0
    for (i in 0 until 32) {
        // input의 가장 오른쪽 비트를 추출
        // 1010 -> 1010 0001 -> 000'0'
        val bit = input and 1

        // 추출한 비트를 왼쪽으로 적절한 위치로 이동
        // result 1010 or bit hshl
        // bit는 0이고, 32
        result = result or (bit shl (31 - i))

        // 다음 비트를 검사하기 위해 input을 오른쪽으로 이동
        input = input ushr 1
    }
    return result
}

fun main() {

}