package com.example.corefunctions

fun main() {

    val numbersList = mutableListOf<Int>()
    println("Введите число")
    var n = readLine()?.toIntOrNull() ?: return/*1*/
    println("Введите числа чтобы заполнить список")

    while (n > 0) {
        val number = readLine()?.toIntOrNull() ?: continue/*2*/
        numbersList.add(number)/*3*/
        n--
    }

    val otherList = printListNumberCount(n)/*4*/

    numbersList.forEach { if (it > 0) println("Положительное число в списке: $it") }/*5*/

    numbersList.filter { it % 2 == 0 }.forEach { println("Чётные числа в списке: $it") }/*6*/

    val numbersSet = numbersList.toSet()
    println("Список уникальных чисел: $numbersSet")/*7*/

    val setSum = numbersSet.sum()/*8*/

    numbersSet.forEach { println("НОД для числа $it: ${greatestCommonFactor(it, setSum)}") }/*9*/

    val numbersMap = mutableMapOf<Int, Int>()
    numbersSet.forEach { numbersMap[it] = greatestCommonFactor(it, setSum) }/*10*/

    numbersMap.forEach { (k, v) -> println("Число: $k, сумма: ${numbersMap.keys.sum()}, НОД: $v") }/*11*/
}

fun printListNumberCount(n: Int): List<Int> {
    println("Введите числа чтобы заполнить ещё один список")
    var printCount = 0
    val numbersList = mutableListOf<Int>()
    while (printCount < n) {
        val number = readLine()?.toIntOrNull() ?: continue
        numbersList.add(number)
        printCount++
    }
    return numbersList
}

tailrec fun greatestCommonFactor(a: Int, b: Int): Int {
    if (b == 0) return a
    return greatestCommonFactor(b, a % b)
}