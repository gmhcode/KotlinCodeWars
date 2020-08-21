package com.example.helloworld

fun brandNameGenerator(word:String): String {
    val capitalizedWord = word.capitalize()
    if (word.first() == word.last()) {
        val secondWord = word.drop(1)
        return capitalizedWord + secondWord
    }
    return "The $capitalizedWord"
}




//func brandNameGenerator(word string) string {
//    capitalizedWord := strings.Title(strings.ToLower(word))
//
//    if word[0] == word[len(word)-1] || word[0] == word[len(word)-1]+32 || word[0] == word[len(word)-1]+32 {
//        return capitalizedWord + word[1:]
//    }
//
//    return "The " + capitalizedWord
//}
