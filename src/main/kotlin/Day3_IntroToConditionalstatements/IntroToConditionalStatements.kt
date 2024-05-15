package Day3_IntroToConditionalstatements

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



fun main(args: Array<String>) {
    val N = readLine()!!.trim().toInt()

    when {
        N % 2 != 0 -> println("Weird")
        N in 2..5 -> println("Not Weird")
        N in 6..20 -> println("Weird")
        N > 20 -> println("Not Weird")
    }

}