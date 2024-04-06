package org.example

//fun strStr(haystack: String, needle:String): Int {
//
//    if(haystack == needle) return 0
//
//    var result = -1
//    fun searchKeyword(index: Int) {
//        if(index + needle.length > haystack.length) return
//        val keyword = haystack.subSequence(index, index + needle.length)
//        if(keyword == needle) {
//            result = index
//            return
//        }
//        searchKeyword(index + 1)
//    }
//    searchKeyword(0)
//    return result
//}

fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty()) return 0 // needle이 비어있다면 항상 0을 반환

    // haystack을 순회하며 needle과 같은 부분 문자열이 있는지 확인
    for (i in 0..haystack.length - needle.length) {
        // 현재 위치에서 needle의 길이만큼의 부분 문자열이 needle과 동일한지 확인
        if (haystack.substring(i, i + needle.length) == needle) {
            return i // 동일하다면 현재 인덱스를 반환
        }
    }
    return -1 // 찾지 못했다면 -1 반환
}

fun main() {
    println(strStr("sadbutsad", "sad"))
}