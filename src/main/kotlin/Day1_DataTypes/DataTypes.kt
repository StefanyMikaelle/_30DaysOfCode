package Day1_DataTypes
import java.util.*

object Solution {
    @JvmStatic
    fun main(args: Array<String>) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "

        val scan = Scanner(System.`in`)

        /* Declare second integer, double, and String variables. */
        var numberFirstLineInt = 0
        var numberSecondLineDouble = 0.0
        var inputMensage = ""

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        numberFirstLineInt = scan.nextInt()
        numberSecondLineDouble = scan.nextDouble()
        scan.nextLine()
        inputMensage = scan.nextLine()


        /* Print the sum of both integer variab
        les on a new line. */
        numberFirstLineInt = numberFirstLineInt + i
        println(numberFirstLineInt)
        /* Print the sum of the double variables on a new line. */
        numberSecondLineDouble = numberSecondLineDouble + d
        println(numberSecondLineDouble)
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        println(s + inputMensage)
        scan.close()
    }
}