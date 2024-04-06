package org.example


fun letterCombinations(digits: String): List<String> {

    if (digits.isEmpty()) return listOf()

    val result = mutableListOf<String>()

    val digitTable = mutableMapOf(
        '2' to listOf('a', 'b', 'c'),
        '3' to listOf('d', 'e', 'f'),
        '4' to listOf('g', 'h', 'i'),
        '5' to listOf('j', 'k', 'l'),
        '6' to listOf('m', 'n', 'o'),
        '7' to listOf('p', 'q', 'r', 's'),
        '8' to listOf('t', 'u', 'v'),
        '9' to listOf('w', 'x', 'y', 'z'),
    )

    fun dfs(index: Int, builder: StringBuilder) {

        if (builder.length == digits.length) {
            result.add(builder.toString())
            return
        }

        for (c in digitTable[digits[index]]!!) {
            //c -> a b c
            dfs(index + 1, StringBuilder(builder).append(c))
        }

    }

    dfs(0, StringBuilder())
    return result
}
