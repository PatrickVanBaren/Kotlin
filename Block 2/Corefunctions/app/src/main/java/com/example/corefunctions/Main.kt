package com.example.corefunctions

fun main() {
    println("Введите число")
    val n = readLine()?.toIntOrNull() ?: return/*1*/

    printNumberCount(n)/*2*/

    val numbersList: List<Int> = listFilling(n)/*3*/

    printListNumberCount(n)/*4*/

    printPositiveNumbers(n)/*5*/

    println("Чётные цифры: ${numbersList.filter { it % 2 == 0 }}")/*6*/

    val numbers = setOf(3, 5, 7, 5, 3, 6, 8, 23, 56, 2)
    numbers.forEach { println("Уникальные цифры: $it") }/*7*/

    val collectionSum = numbers.sum()
    println("Сумма чисел коллекции: $collectionSum")/*8*/

    var start = 0
    while (start < numbers.size) {
        println("НОД для числа с идексом ${start}: " +
                "${greatestCommonFactor(numbers.elementAt(start), collectionSum)}")
        start++
    }/*9.1*/
    println("НОД для списка равен: ${calculateGCF(numbers, collectionSum)}")/*9.2*/

    val someMap = createMap(numbers, calculateGCF(numbers, collectionSum))/*10*/

    println(printMap(someMap))/*11*/
}

fun printNumberCount(n: Int) {
    var printCount = 0
    while (printCount < n) {
        println("Вы ввели число: $n")
        printCount++
    }
}

fun listFilling(n: Int): List<Int> {
    var numberCount = 0
    var currentNumber = 1
    val numbersList = mutableListOf<Int>()
    while (numberCount < n) {
        numbersList.add(numberCount, currentNumber)
        numberCount++
        currentNumber++
    }
    return numbersList
}

fun printListNumberCount(n: Int): Any {
    var printCount = 0
    var currentNumber = 1
    val numbersList = mutableListOf<Int>()
    while (printCount < n) {
        numbersList.add(printCount, currentNumber)
        printCount++
        currentNumber++
    }
    return numbersList.forEachIndexed{index, number ->
        println("Индекс в списке: $index, число: $number") }
}

fun printPositiveNumbers(n: Int) {
    var currentNumber = 1
    while (currentNumber <= n) {
        val numberBefore = currentNumber
        currentNumber++
        if (numberBefore < 0) continue
        else println("Положительное число: $numberBefore")
    }
}

tailrec fun greatestCommonFactor(a: Int, b: Int, accum: Int = 0): Int {
    return if (a == 0 || b == 0) 0
    else when {
        a % b == 0 -> accum + b
        b % a == 0 -> accum + a
        a < b -> {
            val number = b % a
            greatestCommonFactor(number, a, number)
        }
        else -> {
            val number = a % b
            greatestCommonFactor(b, number, number)
        }
    }
}

fun calculateGCF(firstNumber: Set<Int>, secondNumber: Int): Set<Int> {
    var start = 0
    val setOfGCF = mutableSetOf<Int>()
    while (start < firstNumber.size) {
        setOfGCF.add(greatestCommonFactor(firstNumber.elementAt(start), secondNumber))
        start++
    }
    return setOfGCF
}

fun createMap(key: Set<Int>, value: Set<Int>): Map<Int, Int> {
    val newMap = mutableMapOf<Int, Int>()
    var sizeCount = 0
    while (sizeCount < key.size) {
        newMap[key.elementAt(sizeCount)] = value.elementAt(sizeCount)
        sizeCount++
    }
    return newMap
}

fun printMap(map: Map<Int, Int>) {
    var iterationCount = 0
    var mapKey = 0
    var mapValue = 0
    var mapSum = 0
    while (iterationCount < map.size) {
        
    }
}
