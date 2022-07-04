package ChapterEightFunctionsAndClosures

import chaptersIntro.ControlStatementsAndRecursion.{filesHere, iterate}

import scala.annotation.tailrec

object TailRecursion {
  def factorial(n: Int): Int =
    @tailrec
    def factorialAcc(acc: Int, n: Int): Int =
      if n <= 1 then acc else factorialAcc(n * acc, n - 1)

    factorialAcc(1, n)
  

  def fibonacci(n: Int): Int =
    if n <= 2 then 1 else fibonacci(n - 1) + fibonacci(n - 2)
  

  def isPrime(n: Int): Boolean =
    @tailrec
    def primeUntil(t: Int): Boolean =
      if t <= 1 then true else n % t != 0 && primeUntil(t - 1)

    primeUntil(n / 2)
  for i <- iterate do println(i)

  for i <- 1 to 5 do println(s"Iteration of $i") //from 1 to 5
  for i <- 1 until 5 do println(s"Iteration of $i") //from 1 to 4

  @tailrec
  def gcd(x: Long, y: Long): Long =
    if y == 0 then x else gcd(y, x % y)


  for file <- filesHere do
    if file.getName.endsWith(".scala") then
      println(file)


  for file <- filesHere do
    if file.isFile && file.getName.endsWith(".scala") then
      println(file)
  

}
