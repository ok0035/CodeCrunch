package org.example

fun isCompleteTree(root: TreeNode?): Boolean {

    val queue: ArrayDeque<TreeNode?> = ArrayDeque()
    var isEnd = false

    queue.addFirst(root)
    while(queue.isNotEmpty()) {
        val node = queue.removeLast()

        if(node == null) isEnd = true
        else {
            if(isEnd) return false
            queue.addFirst(node.left)
            queue.addFirst(node.right)
        }
    }

    return true
}