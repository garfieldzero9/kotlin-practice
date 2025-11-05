package org.example.easy

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    val firstElement = strs[0]
    for (i in firstElement.indices) {
        for (word in strs) {
            if (i == word.length || word[i] != firstElement[i]) {
                return firstElement.take(i)
            }
        }
    }

    return firstElement
}
