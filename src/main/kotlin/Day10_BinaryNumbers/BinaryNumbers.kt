package Day9_Recursion


//*
//* Complete the 'factorial' function below.
//*
//* The function is expected to return an INTEGER.
//* The function accepts INTEGER n as parameter.
//*/

fun factorial(n: Int): Int {
    // Write your code here
    return if (n == 1) 1 else factorial(n-1).times(n)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = factorial(n)

    println(result)
}