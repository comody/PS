package com.daily.ps.recursive

import java.util.*

/* https://www.acmicpc.net/problem/18511 */
class `큰 수 구성하기` {

    fun test() {
        val scanner = Scanner(System.`in`)

        val n = scanner.nextInt()
        val k = scanner.nextInt()
        val digits = IntArray(k) { scanner.nextInt() }

        digits.sortDescending()

        var result = -1
        fun dfs(current: Int) {
            if (current > n) return
            result = maxOf(result, current)
            for (digit in digits) {
                dfs(current * 10 + digit)
            }
        }

        dfs(0)
        println(result)
    }
}