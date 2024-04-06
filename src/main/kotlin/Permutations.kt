package org.example

import java.util.*
import java.util.stream.Collectors

fun main() {
    Permutations().permute(intArrayOf(1, 2, 3))
}

class Permutations {

//    fun permute(nums: IntArray): List<List<Int>> {
//        // 결과 저장 리스트 선언
//        val results: MutableList<List<Int>> = mutableListOf()
//
//        fun dfs(prevElements: MutableList<Int>, elements: List<Int>) {
//            // 리프 노드에 도달하면 결과에 추가
//            if (elements.isEmpty()) {
//                results.add(prevElements.toList())
//            }
//
//            // 전달받은 엘리먼트를 모두 탐색
//            for (e in elements) {
//                // 전달받은 엘리먼트에서 현재 엘리먼트를 제외하고 nextElements로 새롭게 구성
//                val nextElements: MutableList<Int> = ArrayList(elements)
//                nextElements.remove(e)
//
//                // prevElements는 기존 값에 현재 엘리먼트 추가
//                prevElements.add(e)
//                // 재귀 DFS
//                dfs(prevElements, nextElements)
//                // 돌아온 이후에는 prevElements에서 현재 엘리먼트 삭제
//                prevElements.remove(e)
//            }
//        }
//
//        val lst = nums.toList()
//        // DFS 시작
//        dfs(mutableListOf(), lst)
//        return results
//    }

    fun permute(nums: IntArray): List<List<Int>> {
        // 결과 저장 리스트 선언
        val results: MutableList<List<Int>> = mutableListOf()

        fun dfs(prevElements: MutableList<Int>, elements: List<Int>) {

            if(elements.isEmpty()) {
                results.add(prevElements.toList()) // to list를 하지 않으면 참조타입이 되기 때문에 값이 출력되지 않음
            }

            for(element in elements) {
                val nextElements = elements.filter { it != element }
                prevElements.add(element)
                dfs(prevElements, nextElements)
                prevElements.remove(element)
            }
        }

        val lst = nums.toList()
        // DFS 시작
        dfs(mutableListOf(), lst)
        return results
    }
}