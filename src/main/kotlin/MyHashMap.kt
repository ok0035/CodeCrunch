package org.example

class MyHashMap() {

    class Node(val item: Int, var next: Node? = null)

    private val nodes: Array<Node?> = arrayOfNulls(1000000)

    fun put(key: Int, value: Int) {
        val index = key % nodes.size
        var node = nodes[index]
        if(node == null) {
            nodes[index] = Node(value)
            return
        }
        while(node!!.next != null) {
            node = node.next
        }
        node.next = Node(item = value)
    }

    fun get(key: Int): Int {
        val index = key % nodes.size
        if(nodes[index] == null) return -1
        var node = nodes[index]
        while(node?.next != null) {
            node = node.next
        }
        return node!!.item
    }

    fun remove(key: Int) {
        val index = key % nodes.size
        nodes[index] = null
    }
}