/**
 * CHALLENGE DESCRIPTION:
 *
 * Write a program which reverses the words in an input sentence.
 *
 * INPUT SAMPLE:
 *
 * The first argument is a file that contains multiple sentences, one per line.
 * Empty lines are also possible.
 *
 * For example:
 *
 * Hello World
 * Hello CodeEval
 *
 * OUTPUT SAMPLE:
 *
 * Print to stdout each sentence with the reversed words in it, one per line.
 * Empty lines in the input should be ignored. Ensure that there are no trailing
 * empty spaces in each line you print.
 *
 * For example:
 *
 * World Hello
 * CodeEval Hello
 */
object Main extends App {
  val source = io.Source.fromFile(args(0))
  val lines = source.getLines.filter{ _.nonEmpty }

  for (line <- lines) {
    val words = line.trim.split("\\s+")
    val reversed = words.reverse.mkString(" ")
    println(reversed)
  }
}
