package org.example

import java.util.Deque
import java.util.LinkedList

fun main() {

    val root = ListNode(1)
    var node: ListNode? = root
    println("add element -> ${node?.`val`}")
    for(i in 2 until 6) {
        node?.next = ListNode(i)
        println("add element -> ${node?.next?.`val`}")
        node = node?.next
    }

    reverseList(root)
}

fun reverseList(head: ListNode?): ListNode? {

    var node = head
    val list: Deque<ListNode?> = LinkedList()

    while(node != null) {
        list.add(node)
        node = node.next
    }

    val lastPoll = list.pollLast() ?: return null
    val resultNode = ListNode(lastPoll.`val`)
    node = resultNode

    while(list.isNotEmpty()) {
        val poll = list.pollLast() ?: break
        node?.next = ListNode(poll.`val`)
        node = node?.next
    }

    return resultNode

}

fun reverseList2(head: ListNode?): ListNode? {

    var node = head
    var prev: ListNode? = null

    while(node != null) {
        /*
        * node가 1 -> null
        * node가 2 -> 1
        * node가 3 -> 2
        * node가 4 -> 3
        * */
        val next = node.next
        node.next = prev
        prev = node
        node = next

    }

    return prev

}