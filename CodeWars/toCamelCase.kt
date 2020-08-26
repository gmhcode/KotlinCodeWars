package com.example.mycalculator

import java.util.*

fun main() {
    println(toCamelCase("The-stealth-warrior"))
}

fun toCamelCase(str: String): String {
    var newString = ""
    var prev = ""
    for(i in str) {
    val iAsString = i.toString()

        if (iAsString == "_" || iAsString == "-" ) {
            prev = "_"
            continue
        }
        if (prev == "_" || prev == "-") {
            newString += iAsString.toUpperCase(Locale.ROOT)
        }else {
            newString += iAsString
        }
        prev = iAsString
    }
    return newString
}
//BEST PRACTICE
//fun toCamelCase(str: String) = str.split('-', '_').mapIndexed { i, it -> if (i != 0) it.capitalize() else it }.joinToString("")
//Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
//
//Examples
//toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
//
//toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"