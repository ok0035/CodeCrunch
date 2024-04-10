package org.example

fun generate(numRows: Int): List<List<Int>> {

    val result = mutableListOf<List<Int>>()

    for(i in 0 until numRows) {
        if(i == 0) {
            result.add(listOf(1))
            continue
        } else if(i == 1) {
            result.add(listOf(1, 1))
            continue
        }

        var start = 1
        val list = mutableListOf(1)
        while(start < result.size) {
            list.add(result.last()[start-1] + result.last()[start])
            start++
        }
        list.add(1)
        result.add(list)
    }

    return result.toList()
}