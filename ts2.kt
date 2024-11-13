fun main() {
    // Задаем массив
    val array = arrayOf(
        intArrayOf(5, 9, 6, 7, 2),
        intArrayOf(7, 7, 4, 5, 3),
        intArrayOf(6, 4, 3, 8, 7),
        intArrayOf(7, 5, 8, 4, 8),
        intArrayOf(2, 3, 7, 8, 1)
    )

    val sym = array.size == 5 && // Дополнительная проверка размера
            array.indices.all { i ->
                array[i].indices.take(i + 1).all { j ->
                    array[i][j] == array[j][i]
                }
            }

    if (sym) {
        println("Массив симметричен относительно главной диагонали.")
    } else {
        println("Массив не симметричен относительно главной диагонали.")
    }
}
