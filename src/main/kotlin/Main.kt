fun main() {
    println("Введите кол-во строк в массиве: ")
    val rows = readln()!!.toInt()

    println("Введите кол-во столбцов в массиве: ")
    val cols = readln()!!.toInt()

    val array = Array(rows) { IntArray(cols) }

    println("Введите $rows * $cols трехзначных чисел, разделяя каждое число нажатием Enter: ")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            array[i][j] = readln()!!.toInt()
        }

    }
    val flatArray = array.flatMap { it.toList() }.flatMap { it.toString().toList() }
    val uniqueDigits = flatArray.distinct().count()
    println("Двумерный массив: ")
    for (i in array) {
        for (j in i) {
            print("$j\t")
        }
        println()
    }
    println("В массиве использовано $uniqueDigits уникальных чисел")
}