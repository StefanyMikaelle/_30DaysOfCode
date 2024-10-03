package __Bonus_Kotlin_Coursera.Modulo2

import java.util.*
import kotlin.time.times

fun main() {

    /*
    -------------------------------------------
    Exercício: Praticar o uso de funções com resultados
    -------------------------------------------
    */
    var score = 0;
    println(score)
    score += getPoints(10, 1)
    println(score)
    score += getPoints(20, 2)
    println(score)
    score += getPoints(-10, 1)
    println(score)
    score += getPoints(5, 3)
    println(score)
    score += getPoints(-15, 2)
}

fun getPoints(basePoints: Int , boost: Int) : Int{
    return basePoints * boost
}