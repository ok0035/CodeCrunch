package org.example

import java.util.PriorityQueue


fun findItinerary(tickets: List<List<String>>): List<String> {

    val results: MutableList<String> = mutableListOf()
    val fromToMap: MutableMap<String, PriorityQueue<String>> = mutableMapOf()
    tickets.forEach { ticket ->
        fromToMap.putIfAbsent(ticket[0], PriorityQueue())
        fromToMap[ticket[0]]?.add(ticket[1])
    }

    fun dfs(
        results: MutableList<String>,
        fromToMap: MutableMap<String, PriorityQueue<String>>,
        from: String
    ) {
        while (fromToMap.containsKey(from) && fromToMap[from]?.isNotEmpty() == true) {
            dfs(results, fromToMap, fromToMap[from]!!.poll())
        }
        results.add(0, from)

    }

    dfs(results, fromToMap, "JFK")

    return results

}
