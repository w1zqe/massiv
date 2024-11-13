fun main() {
    println("Введите первый массив чисел, разделяя элементы пробелом:")
    val a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    println("Введите второй массив чисел, разделяя элементы пробелом:")
    val b = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    val c = findIntersection(a, b)

    println("Пересечение массивов: ${c.joinToString(", ")}")
}

fun findIntersection(a: IntArray, b: IntArray): List<Int> {
    val c = mutableListOf<Int>()
    val countMap = mutableMapOf<Int, Int>()

    a.forEach { number ->
        countMap[number] = (countMap[number] ?: 0) + 1
    }
    b.forEach { number ->
        val count = countMap[number] ?: 0
        if (count > 0) {
            c.add(number)
            countMap[number] = count - 1
        }
    }

    return c
}

