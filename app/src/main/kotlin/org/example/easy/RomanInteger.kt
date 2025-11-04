package org.example.easy

fun romanToInt(s: String): Int {
    val dict = mapOf<String, Int>(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )

    var result = 0
    var prevValue = 0
    for (i in s.length - 1 downTo 0) {
        val dictVal = dict[s[i].toString()] ?: 0
        if (prevValue <= dictVal) {
            result += dictVal
        } else {
            result -= dictVal
        }
        prevValue = dictVal
    }

    return result
}
