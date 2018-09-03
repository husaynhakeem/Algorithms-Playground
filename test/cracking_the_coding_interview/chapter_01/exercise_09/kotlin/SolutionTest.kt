package cracking_the_coding_interview.chapter_01.exercise_09.kotlin

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {

    private val solution = Solution()

    @Test
    fun isRotation_1() {
        val a = "waterbottle"
        val b = "erbottlewat"

        val result = solution.isRotation(a, b)

        assertTrue(result)
    }

    @Test
    fun isRotation_2() {
        val a = "abd"
        val b = "dba"

        val result = solution.isRotation(a, b)

        assertFalse(result)
    }
}