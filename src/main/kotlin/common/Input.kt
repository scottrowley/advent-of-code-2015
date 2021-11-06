import java.io.File

const val resources = "src/main/resources"

fun readInput(filename: String): String = openInputFile(filename).readText()

fun readInputLines(filename: String): List<String> = openInputFile(filename).readLines()

private fun openInputFile(filename: String) = File("$resources/$filename")