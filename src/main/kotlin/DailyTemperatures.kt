package org.example

import java.util.*

fun dailyTemperatures(temperatures: IntArray): IntArray {

    val stack: Deque<Int> = LinkedList()
    val result = IntArray(temperatures.size)

    for(i in temperatures.indices) {
        while(stack.isNotEmpty() && temperatures[i] > temperatures[stack.peek()]) {
            val pop = stack.pop()
            result[pop] = i - pop
        }
        stack.push(i)
    }

    return result
}