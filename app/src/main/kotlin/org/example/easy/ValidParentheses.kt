package org.example.easy

fun isValidParentheses(s: String): Boolean {
    if (s.isEmpty()) return true
    val bracketPairs = mapOf<Char, Char>(
        '(' to ')',
        '[' to ']',
        '{' to '}'
    )
    val stack = mutableListOf<Char>()
    for (i in s.indices) {
        if (bracketPairs.containsKey(s[i])) {
            stack.add(s[i])
        } else {
            if (stack.isEmpty()) {
                return false
            }
            val lastOpen = stack.removeLast()
            if (bracketPairs[lastOpen] != s[i]) {
                return false
            }
        }
    }

    return stack.isEmpty()
}
