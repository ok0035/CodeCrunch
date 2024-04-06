package org.example

import java.util.*

fun networkDelayTime(times: Array<IntArray>, n: Int, k: Int): Int {
    val graph = mutableMapOf<Int, MutableList<Pair<Int, Int>>>()
    times.forEach { (u, v, w) ->
        graph.computeIfAbsent(u) { mutableListOf() }.add(Pair(v, w))
    }

    val distance = IntArray(n + 1) { Int.MAX_VALUE }
    distance[k] = 0
    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
    pq.add(Pair(k, 0))

    while (pq.isNotEmpty()) {
        val (node, dist) = pq.poll()
        if (dist > distance[node]) continue
        graph[node]?.forEach { (next, time) ->
            val nextDist = dist + time
            if (nextDist < distance[next]) {
                distance[next] = nextDist
                pq.add(Pair(next, nextDist))
            }
        }
    }

    val maxWait = distance.drop(1).maxOrNull()!!
    return if (maxWait == Int.MAX_VALUE) -1 else maxWait
}
