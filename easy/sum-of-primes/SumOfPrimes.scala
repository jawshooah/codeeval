/**
 * CHALLENGE DESCRIPTION:
 *
 * Write a program which determines the sum of the first 1000 prime numbers.
 *
 * INPUT SAMPLE:
 *
 * There is no input for this program.
 *
 * OUTPUT SAMPLE:
 *
 * Print to stdout the sum of the first 1000 prime numbers.
 *
 * 3682913
 */
object Main extends App {
  final val Limit = 1000

  val sum = sumOfPrimes(Limit)
  Console.println(sum)

  def sumOfPrimes(limit: Int): Int = {
    def isPrime(n: Int, primes: List[Int]): Boolean =
      primes.dropWhile{ _ > Math.sqrt(n) }.forall{ n % _ != 0 }

    @annotation.tailrec
    def primes(acc: List[Int], n: Int): List[Int] =
      if (acc.length == limit) acc
      else {
        val newAcc = if (isPrime(n, acc)) n :: acc else acc
        primes(newAcc, n + 2)
      }

    primes(List(2), 3).sum
  }
}
