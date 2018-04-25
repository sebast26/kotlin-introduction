package pl.sgorecki.kotlin

fun collections() {
    val max = listOf(2, 42, 4).max()
    val maxBy: String? = listOf("a", "ab", "ccc", "ac").maxBy { it.length }

    val sortedBy = listOf("a", "ab", "ccc", "ac").sortedBy { it.length }
    val groupBy: Map<Int, List<String>> = listOf("a", "ab", "ccc", "ac").groupBy { it.length }

    val numbers = listOf(-1, 42, -30, 12, 155)
    val partition: Pair<List<Int>, List<Int>> = numbers.partition { it > 0 }
    val (positive, negative) = numbers.partition { it > 0 }

}