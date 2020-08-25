package com.example.ageinminutes
fun main() {
   println(hasEnding("qwetyu ", "tyu"))
}


fun hasEnding(str:String, end:String): Boolean {
    var st = str.replace(" ","")
    val en = end.replace(" ","")
    if (st == en) return true


    for( i in 0 until str.length - 1) {
        println(i)
        val e = str.substring(i,str.length -1 )
        if (e == en) return true
    }
    return false
}
