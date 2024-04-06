package org.example

import java.util.*

fun main() {
    Combinations().combinationSum(intArrayOf(2, 3, 5, 8), 8)
}

class Combinations {

    fun combine(n: Int, k: Int): List<List<Int>> {

        val results: MutableList<List<Int>> = mutableListOf()

        fun dfs(elements: LinkedList<Int>, start: Int, k: Int) {
            if(k == 0) {
                results.add(elements.toList())
                return
            }

            for(i in start..n) {
                elements.add(i)
                dfs(elements, i + 1, k - 1) // k가 0이 될때까지 조합을 찾음
                elements.removeLast() // k == 0 일 때 i + 1 된 상태로 리턴되기 때문에 마지막 인덱스를 삭제함
            }

        }

        dfs(LinkedList(), 1, k)
        return results

    }

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        /*
        * 2 3 5 8
        * 8
        * 합이 8이 되는 케이스 모두 출력
        * */
        val results = mutableListOf<List<Int>>()
        fun dfs(index: Int, path: MutableList<Int>) {
            //합이 8이 되면 return list
            if(path.sum() == target) {
                results.add(path.toList())
                return
            } else if(path.sum() > target) return
            //아니면 다른 후보를 더해서 다시 dfs 재귀호출

            for(i in index until candidates.size) {
                path.add(candidates[i])
                dfs(i, path)
                path.removeLast()
            }

        }

        dfs(0, mutableListOf())
        return results
    }
}