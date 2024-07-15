package com.daily.ps.bruteforce

import java.util.*
import kotlin.math.min
/*
https://www.acmicpc.net/source/81105360
 */
class `Four Squares` {
    fun test(){
        val scanner = Scanner(System.`in`)

        val n = scanner.nextInt()

        val dp = IntArray(n + 1) { it }

        for (i in 1..n) {
            var j = 1
            while (j * j <= i) {
                dp[i] = min(dp[i], dp[i - j * j] + 1)
                j++
            }
        }

        println(dp[n])
    }
}