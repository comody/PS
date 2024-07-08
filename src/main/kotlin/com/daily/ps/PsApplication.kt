package com.daily.ps


import java.util.*

fun mainScanner(args: Array<String>) = with(Scanner(System.`in`)) {

    val name = nextLine()
    val age = nextInt()

    println("name: $name, age: $age")
}

fun mainBufferScanner(args: Array<String>) = with(System.`in`.bufferedReader()){
    val name = readLine()
    val age = readLine().toInt()

    println("name: $name, age: $age")

    // BufferedReader에서 띄워쓰기로 구분된 Integer를 가공하려면 StringTokenizer를 사용해야 합니다.
    val st = StringTokenizer(readLine())
    val arr = ArrayList<Int>()
    while (st.hasMoreTokens()) {
        arr.add(st.nextToken().toInt())
    }
    println("Contents Of an Array: $arr")
}

fun main(args: Array<String>) {
    val input = """
        17
    """.trimIndent()

    val scanner = Scanner(input)

    val name = scanner.nextLine()
    val n = scanner.nextInt()
//    println("name: $n, age: $result")
}

