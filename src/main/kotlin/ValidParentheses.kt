package org.example

import java.util.*

fun isValid(s: String): Boolean {

    val ss = s.toCharArray()
    var i = 0
    val map: Map<Char, Char> = mapOf(
        ')' to '(',
        '}' to '{',
        ']' to '['
    )
    val stack: Deque<Char> = LinkedList()

    while (i < ss.size) {
        println("${map.containsKey(ss[i])}")
        if (!map.containsKey(ss[i]))
            stack.push(ss[i])
        else if (stack.isEmpty() || stack.pop() != map[ss[i]]) return false
        i++
    }

    return stack.size == 0

}

fun main() {
    val s = "()[]{}"
    isValid(s)
}