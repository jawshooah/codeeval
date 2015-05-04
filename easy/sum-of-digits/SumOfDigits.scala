/**
 * CHALLENGE DESCRIPTION:
 *
 * Given a positive integer, find the sum of its constituent digits.
 *
 * INPUT SAMPLE:
 *
 * The first argument will be a path to a filename containing positive integers,
 * one per line. E.g.
 *
 * 23
 * 496
 *
 * OUTPUT SAMPLE:
 *
 * Print to stdout, the sum of the numbers that make up the integer, one per
 * line. E.g.
 *
 * 5
 * 19
 */
object Main extends App {
  val source = io.Source.fromFile(args(0))
  val lines = source.getLines.filter{ _.nonEmpty }

  for (line <- lines) {
    val sum = line.map{ _.asDigit }.sum
    println(sum)
  }
}
