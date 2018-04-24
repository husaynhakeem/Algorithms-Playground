package cracking_the_coding_interview.chapter1_exercise9.kotlin


fun main(args: Array<String>) {
    println(isRotation("waterbottle", "erbottlewat"))
}

private fun isRotation(first: String, second: String): Boolean {
    if (first.length != second.length)
        return false

    val orderedSecond = cracking_the_coding_interview.chapter1_exercise9.kotlin.orderCharacters(first, second)
    return orderedSecond.isSubstring(first)
}

fun orderCharacters(first: String, second: String): String {
    var sortIndex = 0
    var orderedSecond = second

    for (c in first.toCharArray()) {
        val index = orderedSecond.lastIndexOf(c)

        if (index < 0)
            return orderedSecond

        orderedSecond = orderedSecond.swapCharacters(index, sortIndex)
        println("Index: " + sortIndex + ", text: " + orderedSecond)

        sortIndex++
    }

    return orderedSecond
}

private fun String.swapCharacters(firstIndex: Int, secondIndex: Int): String {
    val temp = this[firstIndex]
    var result = ""

    result = this.replaceCharacter(firstIndex, this[secondIndex])
    result = this.replaceCharacter(secondIndex, temp)

    return result
}

private fun String.replaceCharacter(index: Int, c: Char): String {
    val chars = this.toCharArray()
    chars[index] = c
    return String(chars)
}

private fun String.isSubstring(text: String): Boolean {
    return text.contains(this)
}