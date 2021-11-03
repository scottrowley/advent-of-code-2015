package solutions

import outputSolution
import readInput

fun main(args: Array<String>) {
  val input = readInput("day01.txt")

  outputSolution(
    1,
    part1(input),
    part2(input)
  )
}

fun part1(input: String): Int = input.count { it == '(' } - input.count { it == ')' }

fun part2(input: String): Int {
  var floor = 0
  var position = 0

  while (position < input.length && floor >= 0) {
    if (input[position] == '(') {
      floor++
    } else if (input[position] == ')') {
      floor--
    }

    position++
  }

  return position
}