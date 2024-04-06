package org.example

import java.util.Deque
import java.util.LinkedList


/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 */

fun main() {

    val node = ListNode(1)
    node.next = ListNode(2)

    println(isPalindrome(node))
}

fun isPalindrome(head: ListNode?): Boolean {

    val deque: Deque<Int> = LinkedList()
    var node = head
    while (node != null) {
        deque.add(node.`val`)
        node = node.next
    }

    while (deque.isNotEmpty() && deque.size > 1) {

        if (deque.pollFirst() != deque.pollLast())
            return false

    }

    return true

}