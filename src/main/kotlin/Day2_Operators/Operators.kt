package Day2_Operators

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'solve' function below.
 *
 * The function accepts following parameters:
 *  1. DOUBLE meal_cost
 *  2. INTEGER tip_percent
 *  3. INTEGER tax_percent
 */

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Int {
    // Write your code here

    val tip = meal_cost * tip_percent / 100

    val tax = meal_cost * tax_percent / 100

    val total_cost = meal_cost + tip + tax

    val rounded_total_cost = Math.round(total_cost).toInt()

    return rounded_total_cost

}

fun main(args: Array<String>) {
    val meal_cost = readLine()!!.trim().toDouble()

    val tip_percent = readLine()!!.trim().toInt()

    val tax_percent = readLine()!!.trim().toInt()

    val result : Int  = solve(meal_cost, tip_percent, tax_percent)

    println(result)
}
