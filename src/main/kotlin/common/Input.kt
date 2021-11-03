import java.io.File

const val resources = "src/main/resources"

fun readInput(filename: String): String = File("$resources/$filename").readText()