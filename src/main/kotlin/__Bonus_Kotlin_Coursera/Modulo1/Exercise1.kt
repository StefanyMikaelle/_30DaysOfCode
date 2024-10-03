package __Bonus_Kotlin_Coursera.Modulo1

import java.util.*

fun main(args: Array<String>) {

    /*
    -------------------------------------------
    Tarefa 1: Realizar operações em números
    -------------------------------------------
    */

//    println(123 + 456 * 789)
//    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
//    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
//    println(13530.0 / 1.23)

    /*
    -------------------------------------------
    Tarefa 2: Executar operações matemáticas em variáveis
    -------------------------------------------
    */

    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86

    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
    val averageScore = totalScore/3

    println(totalScore)
    println(averageScore)

    /*
    -------------------------------------------
    Tarefa 3: executar mais operações em variáveis
    -------------------------------------------
    */

    val boostMultiplier= 4
    val scoreBoost= totalScore * boostMultiplier
    val finalBoostedScore = totalScore+scoreBoost

    println(scoreBoost)
    println(finalBoostedScore)
}