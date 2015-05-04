/**
 * CHALLENGE DESCRIPTION:
 *
 * Print the size of a file in bytes.
 *
 * INPUT:
 *
 * The first argument to your program has the path to the file you need to check
 * the size of.
 *
 * OUTPUT SAMPLE:
 *
 * Print the size of the file in bytes. E.g.
 *
 * 55
 */
object Main extends App {
  val file = new java.io.File(args(0))
  println(file.length)
}
