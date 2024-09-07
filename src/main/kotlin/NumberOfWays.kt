package org.example

import kotlin.math.pow

fun numberOfWays(n: Int, x: Int): Int {
    val mod = 1_000_000_007  // 모듈로 연산을 위한 값 (10^9 + 7)
    val dp = IntArray(n + 1)  // DP 배열 선언
    dp[0] = 1  // dp[0]은 1로 초기화

    // 1부터 n까지의 정수 i에 대해 i^x를 구하고 dp 배열 업데이트
    for (i in 1..n) {
        val power = i.toDouble().pow(x).toInt()
        if (power > n) break  // power가 n보다 커지면 중단
        for (j in n downTo power) {
            dp[j] = (dp[j] + dp[j - power]) % mod  // 모듈로 연산을 이용해 dp 업데이트
        }
    }

    return dp[n]  // 최종 결과는 dp[n]에 저장됨
}

fun main() {
    val n = 160
    val x = 3
    println(numberOfWays(n, x))  // 출력: 2 (160 = 2^3 + 3^3 + 5^3, 160 = 4^3 + 4^3 + 4^3)
}