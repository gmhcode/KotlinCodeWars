package com.example.mycalculator

fun main() {
    println(deleteNth(intArrayOf(1,1,2,2,4,5,6,4,6,7,6,7,8),5))
}

    fun deleteNth(elements:IntArray, maxOcurrences:Int):IntArray {
        //Code here ;)
        var dict = mutableMapOf<Int,Int>()

        var a = dict[1] ?: 0
        val array = mutableListOf<Int>()

        for (i in elements) {
            var a = dict[i] ?: 0
            a++
            dict[i] = a
            if (a <= maxOcurrences) {
                array.add(i)
                println(i)
            }
//
//            print("Dict: ")
//            println(dict)
        }

//        print("Keys: ")
//        println(dict.keys)
        return array.toIntArray()
    }

//Best
//   fun deleteNth(elements: IntArray, n: Int): IntArray {
//         val counts = mutableMapOf<Int, Int>()
//         fun countFilter(x: Int) = counts.compute(x, { _, count -> count?.plus(1) ?: 1 })!! <= n
//         return elements.filter { countFilter(it) }.toIntArray()
//     }


//Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they want to show Charlie their entire collection. However, Charlie doesn't like these sessions, since the motive usually repeats. He isn't fond of seeing the Eiffel tower 40 times. He tells them that he will only sit during the session if they show the same motive at most N times. Luckily, Alice and Bob are able to encode the motive as a number. Can you help them to remove numbers such that their list contains each number only up to N times, without changing the order?
//
//Task
//Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].