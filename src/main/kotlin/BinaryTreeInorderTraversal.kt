package org.example

fun inorderTraversal(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()
    fun binarySearch(node: TreeNode?) {
        if (node == null) {
            return
        }
        binarySearch(node.left)
        result.add(node.`val`)
        binarySearch(node.right)
    }
    binarySearch(root)
    return result.toList()
}