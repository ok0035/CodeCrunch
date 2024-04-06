package org.example

import com.sun.source.tree.Tree


//fun maxDepth(root: TreeNode?): Int {
//
//    var maxDepth = 0
//
//    fun checkDepth(node: TreeNode?, depth: Int) {
//
//        if(node == null) return
//        checkDepth(node.left, depth + 1)
//        checkDepth(node.right, depth + 1)
//
//        if(depth > maxDepth) maxDepth = depth
//
//    }
//
//    checkDepth(root, 0)
//    return maxDepth
//}

fun maxDepth(root: TreeNode?): Int {
    // 노드가 null이면, 깊이는 0입니다.
    if (root == null) return 0

    // 왼쪽과 오른쪽 자식 노드로 재귀 호출을 하여 그 결과 중 더 큰 값에 1을 더합니다.
    // 이는 현재 노드의 깊이를 포함하기 때문입니다.
    val leftDepth = maxDepth(root.left)
    val rightDepth = maxDepth(root.right)

    // 왼쪽과 오른쪽 자식 중 더 큰 깊이에 현재 노드의 깊이(1)를 더합니다.
    return leftDepth.coerceAtLeast(rightDepth) + 1
}
