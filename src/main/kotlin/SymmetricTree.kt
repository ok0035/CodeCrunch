package org.example

import java.util.*


/*
* 왼쪽 노드는 유지하고 오른쪽 노드만 스왑한 뒤 왼쪽 노드와 동일한지 확인한다.
* */

fun isMirror(node1: TreeNode?, node2: TreeNode?): Boolean {
    if (node1 == null && node2 == null) return true
    if (node1 == null || node2 == null) return false
    return (node1.`val` == node2.`val`)
            && isMirror(node1.right, node2.left)
            && isMirror(node1.left, node2.right)
}

fun isSymmetric(root: TreeNode?): Boolean {
    return isMirror(root, root)
}

fun isSymmetricIterative(root: TreeNode?): Boolean {
    val queue: Queue<TreeNode?> = LinkedList<TreeNode?>()
    queue.add(root)
    queue.add(root)
    while (queue.isNotEmpty()) {
        val t1 = queue.poll()
        val t2 = queue.poll()
        if (t1 == null && t2 == null) continue
        if (t1 == null || t2 == null) return false
        if (t1.`val` != t2.`val`) return false
        queue.add(t1.left)
        queue.add(t2.right)
        queue.add(t1.right)
        queue.add(t2.left)
    }
    return true
}