package cracking_the_coding_interview.chapter_01.exercise_09.kotlin

class Solution {

    fun isRotation(first: String, second: String) = second.isSubstring(first + first)

    private fun String.isSubstring(text: String): Boolean {
        return text.contains(this)
    }
}