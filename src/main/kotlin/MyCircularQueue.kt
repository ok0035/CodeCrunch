package org.example

class MyCircularQueue(k: Int) {

    val q = IntArray(k)
    var front: Int = 0
    var rear: Int = -1
    var len = 0

    fun enQueue(value: Int): Boolean {
        if(!isFull()) {
            rear = (rear + 1) % q.size
            q[rear] = value
            len++
            return true
        } else return false
    }

    fun deQueue(): Boolean {
        if(isEmpty()) return false
        front = (front + 1) % q.size
        len--
        return true
    }

    fun Front(): Int {
        if(isEmpty()) return -1
        return q[front]
    }

    fun Rear(): Int {
        if(isEmpty()) return -1
        return q[rear]
    }

    fun isEmpty(): Boolean {
        return len == 0
    }

    fun isFull(): Boolean {
        return len == q.size
    }

}