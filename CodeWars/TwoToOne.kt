package com.example.helloworld


fun longest(s1:String, s2:String):String {
    return (s1 + s2).toSortedSet().joinToString("")
}

// Examples:
// a = "xyaabbbccccdefww"
// b = "xxxxyyyyabklmopq"
// longest(a, b) -> "abcdefklmopqwxy"

// a = "abcdefghijklmnopqrstuvwxyz"
// longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"