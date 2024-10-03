package __Bonus_Kotlin_Coursera.Modulo1

import java.util.*

fun main() {

    /*
    -------------------------------------------
    Exercício: Praticar o uso de condições
    Uso das declarações if, if-else-if e when.
    -------------------------------------------
    */

    val weekday : String = "Segunda-feira"

    if(weekday == "Segunda-feira"){
        println("8 AM to 12 PM (8:00 - 12:00)")
    } else if(weekday == "Terça-feira"){
        println("das 8h às 18h (das 8h às 18h)")
    } else if (weekday == "Quarta-feira"){
        println("8h às 18h (8:00 - 18:00)")
    } else if (weekday == "Quinta-feira"){
        println("das 8h às 18h (8:00 - 18:00)")
    } else if (weekday == "Sexta-feira"){
        println("das 8:00 às 21:00 (8:00 - 21:00)")
    } else if (weekday == "Sábado"){
        println()
    }



}