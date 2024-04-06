package org.example

fun main() {
    val root = ListNode(0)
    var node: ListNode? = root

    for(i in 1..6) {
        node?.next = ListNode(i)
        node = node?.next
    }

    val rootVal = oddEvenList(root.next)
    node = rootVal
    while(node != null)  {
        println(node.`val`)
        node = node.next
    }

}

fun oddEvenList(head: ListNode?): ListNode? {

    val oddRootNode: ListNode? = head
    val evenRootNode: ListNode? = head?.next

    var oddNode: ListNode? = oddRootNode
    var evenNode: ListNode? = evenRootNode

    while(evenNode?.next != null) {
        oddNode?.next = oddNode?.next?.next
        evenNode.next = evenNode.next?.next

        oddNode = oddNode?.next
        evenNode = evenNode.next
    }

    oddNode?.next = evenRootNode

    return oddRootNode
}