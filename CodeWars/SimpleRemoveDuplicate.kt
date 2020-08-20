package com.example.helloworld

fun main() {
    println("hello")

    val s = simpleRemoveDuplicates(arrayOf(3, 4, 4, 3, 6, 3))

    for (i in s) {
        print(i)
    }
    println(s.toString())
}
//In this Kata, you will remove the left-most duplicates from a list of integers and return the result.

// Remove the 3's at indices 0 and 3
// followed by removing a 4 at index 1
//solve([3, 4, 4, 3, 6, 3]); // => [4, 6, 3]
fun simpleRemoveDuplicates(array: Array<Int>): Array<Int> {
    val pocket: MutableList<Int> = mutableListOf()
    for (i in 0 until (array.count() - 1) ) {
        val checkBool = array.slice(i + 1 until (array.count() -1 )).contains(array[i])

        if  (!checkBool) {
            pocket += array[i]
        }
    }
    return pocket.toTypedArray()
}