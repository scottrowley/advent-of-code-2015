package solutions

import outputSolution
import readInputLines

fun main(args: Array<String>) {
  val input = readInputLines("day02.txt")

  outputSolution(
    2,
    part1(input),
    part2(input)
  )
}

private fun part1(input: List<String>): Int {
  return input.map { readDimensions(it) }
    .sumOf { calculateAreaPlusSlack(it) }
}

private fun part2(input: List<String>): Int {
  return input.map { readDimensions(it) }
    .sumOf { calculateRibbonLengthPlusSlack(it) }
}

private fun readDimensions(input: String): List<Int> = input.split('x').map { it.toInt() }.sorted()

private fun calculateAreaPlusSlack(dimensions: List<Int>): Int {
  val area1 = dimensions[0] * dimensions[1] // smallest
  val area2 = dimensions[0] * dimensions[2]
  val area3 = dimensions[1] * dimensions[2]

  return (2 * (area1 + area2 + area3)) + area1
}

private fun calculateRibbonLengthPlusSlack(dimensions: List<Int>): Int {
  val volume = dimensions[0] * dimensions[1] * dimensions[2]
  val smallestPerimeter = 2 * (dimensions[0] + dimensions[1])

  return smallestPerimeter + volume
}