package com.daily.ps.recursive

/*https://www.acmicpc.net/problem/4779*/
class `칸토어 집합` {
    private fun test(args: Array<String>) = with(System.`in`.bufferedReader()) {
        val results = mutableListOf<String>()
        var line: String?

        while (readLine().also { line = it } != null) {
            val n = line!!.toInt()
            val length = Math.pow(3.0, n.toDouble()).toInt()
            val result = CharArray(length) { '-' }
            recursive(0, length, result)
            results.add(String(result))
        }

        results.forEach { println(it) }
    }

    private fun recursive(start: Int, end: Int, result: CharArray) {
        val length = end - start
        if (length == 1) {
            return
        } else {
            val dividedLength = length / 3
            for (i in start + dividedLength until start + 2 * dividedLength) {
                result[i] = ' '
            }
            recursive(start, start + dividedLength, result)
            recursive(start + 2 * dividedLength, end, result)
        }
    }

}