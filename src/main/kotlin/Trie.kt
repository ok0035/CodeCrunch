package org.example

class Trie {

    class TrieNode {
        var children: MutableMap<Char, TrieNode> = mutableMapOf()
        var isEndOfWord: Boolean = false
    }

    private var root = TrieNode()

    fun insert(word: String) {
        var node = root
        for(char in word) {
            node = node.children.getOrPut(char) { TrieNode() }
        }
        node.isEndOfWord = true
    }

    fun search(word: String): Boolean {
        var node = root
        for (char in word) {
            node = node.children[char] ?: return false
        }
        return node.isEndOfWord
    }

    fun startsWith(prefix: String): Boolean {
        var node = root
        for(char in prefix) {
            node = node.children[char] ?: return false
        }
        return true
    }
}

fun main() {

}