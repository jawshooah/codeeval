/**
 * CHALLENGE DESCRIPTION:
 *
 * Write a program which determines the largest prime palindrome less than 1000.
 *
 * INPUT SAMPLE:
 *
 * There is no input for this program.
 *
 * OUTPUT SAMPLE:
 *
 * Print to stdout the largest prime palindrome less than 1000.
 *
 * 929
 */
object Main extends App {
  final val Limit = 1000

  val largest = largestPrimePalindrome(Limit)
  println(largest)

  def largestPrimePalindrome(limit: Int): Int = {
    val sieve = Array.fill(limit + 1)(true)
    var max = 0

    for (i <- 2 to limit if sieve(i)) {
      if (isPalindrome(i.toString)) max = i
      for (j <- 2*i to limit by i if sieve(j)) {
        sieve(j) = false
      }
    }

    max
  }

  def isPalindrome(s: String): Boolean = s == s.reverse
}
