package Day4_ClassVsInstance

import java.util.*


class Person(private var age: Int) {
    init {
        // Add some more code to run some checks on initialAge
        //System.out.println(initialAge + "initialAge");
        //System.out.println(age + "age");
        if (age < 0) {
            this.age = 0
            println("Age is not valid, setting age to 0.")
        }
    }

    fun amIOld() {
        // Write code determining if this person's age is old and print the correct statement:

        if (this.age < 13) {
            println("You are young.")
        } else if (this.age >= 13 && this.age < 18) {
            println("You are a teenager.")
        } else {
            println("You are old.")
        }
    }

    fun yearPasses() {
        // Increment this person's age.
        age++
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sc = Scanner(System.`in`)
            val T = sc.nextInt()
            for (i in 0 until T) {
                val age = sc.nextInt()
                val p = Person(age)
                p.amIOld()
                for (j in 0..2) {
                    p.yearPasses()
                }
                p.amIOld()
                println()
            }
            sc.close()
        }
    }
}