package com.example.ageinminutes

fun main() {
    println(inviteMoreWomen(listOf(1, -1, 1)))
}

fun inviteMoreWomen(l: List<Int>): Boolean {
    // your code here
    var women = 0
    var men = 0
    for (i in l) {
        if (i == 1) {
            men++
        } else {
            women++
        }
    }
    return women < men
}

