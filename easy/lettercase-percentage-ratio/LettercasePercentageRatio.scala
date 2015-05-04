/**
 * CHALLENGE DESCRIPTION:
 *
 * Your task is to write a program which determines (calculates) the percentage
 * ratio of lowercase and uppercase letters.
 *
 * INPUT SAMPLE:
 *
 * Your program should accept a file as its first argument. Each line of input
 * contains a string with uppercase and lowercase letters.
 *
 * For example:
 *
 * thisTHIS
 * AAbbCCDDEE
 * N
 * UkJ
 *
 * OUTPUT SAMPLE:
 *
 * For each line of input, print the percentage ratio of uppercase and lowercase
 * letters rounded to the second digit after the point.
 *
 * For example:
 *
 * lowercase: 50.00 uppercase: 50.00
 * lowercase: 20.00 uppercase: 80.00
 * lowercase: 0.00 uppercase: 100.00
 * lowercase: 33.33 uppercase: 66.67
 */
object Main extends App {
  val source = io.Source.fromFile(args(0))
  val lines = source.getLines.filter{ _.nonEmpty }

  for (line <- lines) {
    val numLower = line.count{ _.isLower }
    val numUpper = line.count{ _.isUpper }
    val total = line.length.toDouble

    val percentLower = "%.2f".format(numLower / total * 100)
    val percentUpper = "%.2f".format(numUpper / total * 100)

    println(s"lowercase: $percentLower uppercase: $percentUpper")
  }
}
