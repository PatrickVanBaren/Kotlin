package com.example.corefunctions

fun main() {

    val numbersList = mutableListOf<Int>()
    var mapElement = 0
    println("Введите число")
    var n = readLine()?.toIntOrNull() ?: return/*1*/
    println("Введите числа чтобы заполнить список")

    while (n > 0) {
        val number = readLine()?.toIntOrNull() ?: return/*2*/
        numbersList.add(number)/*3*/
        n--
    }

    printListNumberCount(n)/*4*/

    numbersList.forEach { if (it > 0) println("Положительное число в списке: $it") }/*5*/

    numbersList.filter { it % 2 == 0 }.forEach { println("Чётные числа в списке: $it") }/*6*/

    val numbersSet = mutableSetOf<Int>()
    numbersSet.addAll(numbersList)
    println("Список уникальных чисел: $numbersSet")/*7*/

    val setSum = numbersSet.sum()/*8*/

    numbersSet.forEachIndexed { _, i ->
        println("НОД для числа $i: ${greatestCommonFactor(i, setSum)}") }/*9*/

    val numbersMap = mutableMapOf<Int, Int>()
    while (n > 0) {
        numbersMap[numbersSet.elementAt(mapElement)] =
            greatestCommonFactor(numbersSet.elementAt(mapElement), setSum)
        n--
        mapElement++
    }
    println(numbersMap)/*10*/

    println("Число ${numbersMap.mapKeys { it }}, " +
            "сумма ${numbersMap.keys.sum()}, НОД ${numbersMap.mapValues { it }}\n")/*11*/
}

fun printListNumberCount(n: Int) {
    println("Введите числа чтобы заполнить ещё один список")
    var printCount = 0
    val numbersList = mutableListOf<Int>()
    while (printCount < n) {
        val number = readLine()?.toIntOrNull() ?: return
        numbersList.add(number)
        printCount++
    }
    numbersList.forEachIndexed{index, number -> println("Индекс в списке: $index, число: $number") }
}

tailrec fun greatestCommonFactor(a: Int, b: Int): Int {
    if (b == 0) return a
    return greatestCommonFactor(b, a % b)
}