package org.example

import java.util.*

fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    if (root == null) return result

    val queue: Queue<TreeNode> = LinkedList()
    queue.offer(root)
    var isLeftToRight = true

    while (queue.isNotEmpty()) {
        val levelSize = queue.size
        val currentLevel = LinkedList<Int>()

        for (i in 0 until levelSize) {
            val node = queue.poll()
            if (isLeftToRight) {
                currentLevel.addLast(node.`val`)
            } else {
                currentLevel.addFirst(node.`val`)
            }

            node.left?.let { queue.offer(it) }
            node.right?.let { queue.offer(it) }
        }

        result.add(currentLevel)
        isLeftToRight = !isLeftToRight
    }

    return result
}
