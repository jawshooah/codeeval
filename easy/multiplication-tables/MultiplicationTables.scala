/**
 * CHALLENGE DESCRIPTION:
 *
 * Print out the grade school multiplication table upto 12*12.
 *
 * INPUT SAMPLE:
 *
 * There is no input for this program.
 *
 * OUTPUT SAMPLE:
 *
 * Print out the table in a matrix like fashion, each number formatted to a
 * width of 4 (The numbers are right-aligned and strip out leading/trailing
 * spaces on each line). The first 3 line will look like:
 *
 * 1   2   3   4   5   6   7   8   9  10  11  12
 * 2   4   6   8  10  12  14  16  18  20  22  24
 * 3   6   9  12  15  18  21  24  27  30  33  36
 */
object Main extends App {
  final val Min = 1
  final val Max = 12

  val table = multiplicationTable(Min to Max)
  Console.println(tableString(table))

  def multiplicationTable(range: Range): Seq[Seq[Int]] =
    range map { i => range map { j => i * j } }

  def tableString(table: Seq[Seq[Int]]): String =
    table.map(rowString).mkString("\n")

  def rowString(row: Seq[Int]): String =
    row.map(cellString).mkString.trim

  def cellString(cell: Int): String =
    "%4s".format(cell.toString)
}
