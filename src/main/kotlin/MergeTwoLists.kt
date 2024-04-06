package org.example

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    /**
     *
     * Linked List 관련 문제가 나올 경우 재귀를 항상 염두해두고 풀 것
     *
     */
    if(list1 == null) return list2
    if(list2 == null) return list1

    return if(list1.`val` < list2.`val`) {
        list1.next = mergeTwoLists(list1.next, list2)
        list1
    } else  {
        list2.next = mergeTwoLists(list2.next, list1)
        list2
    }

}