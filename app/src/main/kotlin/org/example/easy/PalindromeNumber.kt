package org.example.easy

fun isPalindrome(x: Int): Boolean {
    if (x == 0) return true
    if (x < 0 || x % 10 == 0) return false
    var origin = x
    var reversed = 0
    var temp = x

    while (temp > 0) {
        val digit = temp % 10
        reversed = (reversed * 10) + digit
        temp /= 10
    }

    return reversed == origin
}

fun isPalindromeBigInt(x: Int): Boolean {
    if (x == 0) return true
    if (x < 0 || x % 10 == 0) return false
    var origin = x
    var reversed = 0
    var temp = x

    while (temp > reversed) {
        val digit = temp % 10
        reversed = (reversed * 10) + digit
        temp /= 10
    }

    return temp == reversed || temp == (reversed / 10)
}
