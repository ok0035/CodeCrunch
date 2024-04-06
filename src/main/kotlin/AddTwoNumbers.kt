package org.example

import java.math.BigInteger
import java.util.*

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

    var node1 = l1
    var node2 = l2
    val valueStrDeque1: Deque<String> = LinkedList()
    val valueStrDeque2: Deque<String> = LinkedList()
    var valueStr1 = ""
    var valueStr2 = ""

    while(node1 != null) {
        valueStrDeque1.add(node1.`val`.toString())
        node1 = node1.next
    }

    while(node2 != null) {
        valueStrDeque2.add(node2.`val`.toString())
        node2 = node2.next
    }

    while(valueStrDeque1.isNotEmpty()) {
        valueStr1 += valueStrDeque1.pollLast()
    }

    while(valueStrDeque2.isNotEmpty()) {
        valueStr2 += valueStrDeque2.pollLast()
    }

    val sumResult = BigInteger(valueStr1) + BigInteger(valueStr2)
    var resultRootNode: ListNode? = null
    var resultNode: ListNode? = null
    sumResult.toString().reversed().forEach {
        if(resultRootNode == null) {
            resultRootNode  = ListNode(it.digitToIntOrNull() ?: 0)
            resultNode = resultRootNode
        }
        else {
            resultNode?.next = ListNode(it.digitToIntOrNull() ?: 0)
            resultNode = resultNode?.next
        }
    }

    return resultRootNode

}