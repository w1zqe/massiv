fun main() {
    println("Введите слова, разделяя их пробелом:")
    val words = readLine()!!.split(" ")

    val groupW = mutableListOf<List<String>>()
    val wordG = mutableMapOf<String, MutableList<String>>()

    for (word in words) {
        val sort = word.toCharArray().sortedArray().joinToString("") // Сортируем буквы в слове
        wordG[sort] = wordG.getOrDefault(sort, mutableListOf())
            .also { it.add(word) }
    }

    for (group in wordG.values) {
        groupW.add(group)
    }

    println("Слова, сгруппированные по одинаковым буквам:")
    for (group in groupW) {
        println(group.joinToString(", "))
    }
}

