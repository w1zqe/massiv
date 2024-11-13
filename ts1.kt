fun main() {
    println("Введите количество строк массива:")
    val rows = readLine()!!.toInt()

    println("Введите количество столбцов массива:")
    val cols = readLine()!!.toInt()

    val array = Array(rows) { IntArray(cols) }

    println("Введите ${rows * cols} трехзначных чисел:")

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            array[i][j] = readLine()!!.toInt()
        }
    }

    val num = countDistinctDigits(array)

    println("Двумерный массив:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${array[i][j]}   ")
        }
        println()
    }

    println("В массиве использовано $num различных цифр")
}

fun countDistinctDigits(array: Array<IntArray>): Int {
    val digits = mutableSetOf<Int>()

    for (i in 0 until array.size) {
        for (j in 0 until array[i].size) {
            val number = array[i][j]
            digits.add(number / 100)
            digits.add((number % 100) / 10)
            digits.add(number % 10)
        }
    }

    return digits.size
}

