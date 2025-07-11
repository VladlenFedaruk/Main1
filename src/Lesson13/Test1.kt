package Lesson13

/**
Задача 9:
значение.
Напишите расширение для List<Int>, которое возвращает среднее
 */

fun main() {
    val numbers = listOf(1, -5, -8, 9, 32, 0)
    val sum = numbers.newList()
    print(sum)

}

fun List<Int>.newList(): Float {
    return this.sum().toFloat() / this.size
}