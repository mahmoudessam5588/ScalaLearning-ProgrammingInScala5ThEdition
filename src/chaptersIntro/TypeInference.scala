package chaptersIntro

import scala.annotation.tailrec

object TypeInference {
  def main(args: Array[String]): Unit = {
    println("Hello")

    def carbonation(n: Int): Int =
      if n <= 2 then 1 else carbonation(n - 1) + carbonation(n - 2)

    println(carbonation(8))

    def isPrime(n: Int): Boolean =
      @tailrec
      def primeUpTo(t: Int): Boolean =
        if t <= 1 then true else n % t != 0 && primeUpTo(t - 1)

      primeUpTo(n / 2)

    println(isPrime(37))
    println(isPrime(2007))
    println(isPrime(500))


  }

}
