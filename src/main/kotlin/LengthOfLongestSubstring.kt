package org.example

import kotlin.math.max

//fun lengthOfLongestSubstring(s: String): Int {
//
//    val used = mutableMapOf<Char, Int>()
//
//    var left = 0
//    var right = 0
//    var maxLen = 0
//
//    for (c in s) {
//        if(left <= used.getOrDefault(c, -1)) { // used[c] = 0
//            left = used[c]!! + 1
//        } else {
//            maxLen = max(maxLen, right - left + 1)
//        }
//
//        used[c] = right
//        right++
//    }
//
//    return maxLen
//
//}

fun lengthOfLongestSubstring(s: String): Int {

    val used: MutableMap<Char, Int> = mutableMapOf()
    var left = 0 // 시작점을 나타내는 포인터
    var maxLen = 0 // 중복되기 전까지 기록한 문자 길이, 가장 큰 길이를 저장

    for((right, c) in s.toCharArray().withIndex()) {
        //시작점에 있는 인덱스
        if(left <= used.getOrDefault(c, -1)) {
            left = used[c]!! + 1 // abca 라면 두번째 a위치
        } else {
            val len = right - left + 1
            maxLen = max(maxLen, len)
        }

        //해당 글자가 나온 인덱스 업데이트
        used[c] = right
    }

    return maxLen

}