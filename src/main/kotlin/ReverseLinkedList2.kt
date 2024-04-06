package org.example

import java.util.*

fun main() {

    val root = ListNode(1)
    var node: ListNode? = root
    println("add element -> ${node?.`val`}")
    for(i in 2 until 6) {
        node?.next = ListNode(i)
        println("add element -> ${node?.next?.`val`}")
        node = node?.next
    }

    var rootResultNode = reverseBetween(root, 2, 4)

    while(rootResultNode != null) {
        println("result ${rootResultNode.`val`}")
        rootResultNode = rootResultNode.next
    }
}

//fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
//
//    /*
//    * left < right
//    * */
//
//    val deque: Deque<Int> = LinkedList()
//    val leftList: MutableList<Int> = mutableListOf()
//    val rightList: MutableList<Int> = mutableListOf()
//    var node: ListNode? = head
//
//    var leftIdx = left
//
//    while(node != null) {
//        deque.add(node.`val`)
//        node = node.next
//    }
//
//    while((leftIdx-1) > 0) {
//        leftList.add(deque.pollFirst())
//        println(leftList.last())
//        leftIdx--
//    }
//
//    val size = deque.size
//    var rightIdx = right-1
//
//    while(rightIdx < size && deque.size > 0) {
//        rightList.add(deque.pollLast())
//        rightIdx++
//    }
//    leftList.addAll(deque.reversed())
//    leftList.addAll(rightList.reversed())
//
//    val resultRootNode = ListNode(0)
//    var resultNode: ListNode? = resultRootNode
//    leftList.forEach {
//        resultNode?.next = ListNode(it)
//        resultNode = resultNode?.next
//    }
//    return resultRootNode.next
//}

fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {

    if(head == null) return null

    val root = ListNode(0)
    root.next = head

    var startNode: ListNode? = root
    var endNode: ListNode? = null

    for (i in 0 until left-1) {
        startNode = startNode?.next
    }
    endNode = startNode?.next

    for (i in 0 until right - left) {
        val tmp = startNode?.next

        startNode?.next = endNode?.next
        endNode?.next = endNode?.next?.next
        startNode?.next?.next = tmp
    }

    return root.next
}