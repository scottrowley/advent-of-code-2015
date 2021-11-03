fun outputSolution(day: Int, solution1: String = "", solution2: String = "") {
  println("Day ${day.toString().padStart(2, '0')} Solutions")
  println("=".repeat(30))

  println("Part 1: $solution1")
  println("Part 2: $solution2")
}

fun outputSolution(day: Int, solution1: Int = 0, solution2: Int = 0) =
  outputSolution(day, solution1.toString(), solution2.toString())
