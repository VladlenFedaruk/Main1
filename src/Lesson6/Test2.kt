package Lesson6

fun main() {
    val numbers = arrayOf(9, 2, 2, 1, 5, 4, 5, 9, 8, 7)

    println("Original array: ${numbers.joinToString(", ")}")

    // Create a copy of the array to sort
    val sortedArray = numbers.clone()
    sortedArray.sort()

    // Count minimum swaps
    val swaps = countMinSwaps(numbers, sortedArray)

    println("Sorted array: ${sortedArray.joinToString(", ")}")
    println("Minimum number of swaps needed: $swaps")
}

fun countMinSwaps(arr: Array<Int>, sortedArr: Array<Int>): Int {
    val n = arr.size
    val visited = BooleanArray(n) { false }
    var swaps = 0

    // Create a map of value to index for quick lookup
    val valueToIndex = arr.indices.associateBy { arr[it] }

    for (i in 0 until n) {
        if (visited[i] || arr[i] == sortedArr[i]) continue

        var cycleSize = 0
        var j = i

        while (!visited[j]) {
            visited[j] = true
            j = valueToIndex[sortedArr[j]]!!
            cycleSize++
        }

        swaps += cycleSize - 1
    }

    return swaps
}
