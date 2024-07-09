package com.daily.ps.test.recursive

/*
https://www.acmicpc.net/problem/25501
 */

import java.io.BufferedReader
import java.io.InputStreamReader

class `재귀의 귀재` {
    var count = 0

    fun recursion(s: String, l: Int, r: Int): Int {
        count++
        return if (l >= r) 1
        else if (s[l] != s[r]) 0
        else recursion(s, l + 1, r - 1)
    }

    fun isPalindrome(s: String): Int {
        count = 0
        return recursion(s, 0, s.length - 1)
    }

    private fun test() {
        val reader = BufferedReader(InputStreamReader(System.`in`))
        val T = reader.readLine().toInt()
        repeat(T) {
            val S = reader.readLine()
            val result = isPalindrome(S)
            println("$result $count")
        }
    }
}