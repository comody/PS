package com.daily.ps.test.recursive

/* https://www.acmicpc.net/problem/10870 */
class `피보나치 수 5` {
    fun test(args: Array<String>) = with(System.`in`.bufferedReader()) {
        try {
            val n = readLine().toInt()
            if (n < 0 || n > 20) throw IllegalArgumentException("Input must be between 0 and 20")

            val result = fibonacci(n)

            println(result)
        } catch (e: Exception) {
            println(e.message)
        }
    }

    private fun fibonacci(n: Int) : Int {
        if (n < 2) return n

        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}