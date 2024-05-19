package Day7_Arrays
import java.util.*


    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)

        val n = `in`.nextInt()
        val arr = IntArray(n)

        for (i in 0 until n) {
            arr[i] = `in`.nextInt()
        }

        for (i in 0 until n) {
            val idx = n - i - 1
            print(arr[idx].toString() + " ")
        }

        `in`.close()
    }
