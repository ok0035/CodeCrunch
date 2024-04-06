package org.example

fun main() {

    val root  = ListNode(1)
    var node: ListNode? = root
    for(i in 2 .. 4) {
        node?.next = ListNode(i)
        node = node?.next
    }

    swapPairs(root)

}

fun swapPairs(head: ListNode?): ListNode? {

    if(head?.next != null) {
        val p = head.next
        head.next = swapPairs(head.next?.next)
        p?.next = head
        return p
    }
    return head
}