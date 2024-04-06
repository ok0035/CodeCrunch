package org.example

import java.io.*
import java.util.*

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = input.readLine().toInt()
    val problems = mutableListOf<Pair<Int, Int>>()

    for (i in 0 until n) {
        val (deadline, cupRamen) = input.readLine().split(" ").map { it.toInt() }
        problems.add(Pair(deadline, cupRamen))
    }

    // 데드라인에 따라 정렬하고, 같은 데드라인이면 컵라면 수에 따라 정렬
    problems.sortWith(compareBy({ it.first }, { it.second }))

    val pq = PriorityQueue<Int>()
    for ((deadline, cupRamen) in problems) {
        pq.add(cupRamen)
        // 데드라인을 초과하는 경우 가장 작은 컵라면 수를 가진 문제를 제거
        if (pq.size > deadline) {
            pq.poll()
        }
    }

    // 남은 문제들의 컵라면 수 합계
    val result = pq.sum()
    writer.write("$result")
    writer.flush()
    writer.close()
}