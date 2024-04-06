package org.example

import com.sun.source.tree.Tree
import java.util.PriorityQueue


var ti = TreeNode(5)
var v = ti.`val`

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}


class SortedArrayToBST {

    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return createBST(nums, 0, nums.size - 1)
    }

    private fun createBST(nums: IntArray, start: Int, end: Int): TreeNode? {
        if (start > end) return null

        // 중앙 인덱스를 찾음
        val mid = start + (end - start) / 2
        // 중앙 값을 노드 값으로 사용
        val node = TreeNode(nums[mid])

        // 중앙 값의 왼쪽 부분 배열로 왼쪽 서브 트리 생성
        node.left = createBST(nums, start, mid - 1)
        // 중앙 값의 오른쪽 부분 배열로 오른쪽 서브 트리 생성
        node.right = createBST(nums, mid + 1, end)

        return node
    }


}

fun main() {
    SortedArrayToBST().sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9))
}