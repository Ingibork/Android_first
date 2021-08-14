package com.example.android_1

fun main() {
    try {
        println("Введите 1 число")
        val a = readLine()!!.toDouble()
        println("Введите арифметический символ")
        val b = readLine()

        val z = 0.0

        if ((b == "*" || b == "+" || b == "/" || b == "-")) {
            println("Введите 2 число")
            val c = readLine()!!.toDouble()

            if (b.equals("+")) {
                println(a + c)
            }
            if (b.equals("-")) {
                println(a - c)
            }
            if (b.equals("*")) {
                println(a * c)
            }
            if (b.equals("/")) {
                if (c.equals(z)) {
                    println("с 0 запрещено")
                } else {
                    println(a / c)
                }
            }
        } else
            println("Вместо арифметического символа введён другой")

    } catch (e: NumberFormatException) {
        println("Введите ЧИСЛО!")
    }
}