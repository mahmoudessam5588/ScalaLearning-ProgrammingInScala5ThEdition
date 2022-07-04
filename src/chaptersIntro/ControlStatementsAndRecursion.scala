package chaptersIntro

import java.io.File
import scala.annotation.tailrec
import scala.io.StdIn.readLine

object ControlStatementsAndRecursion:
  //for expressions
  //iteration through collections
  val iterate: List[Int] = List[Int](1, 2, 3, 4, 5, 6)

  while
    val line = readLine()
    println(s"Read: $line")
    line != ""
  do ()
  //for for filtering
  val filesHere: Array[File] = (new java.io.File(".")).listFiles()

  

  //functional declarative way of if statement more readable tells the reviewer that the code will never change also
  //better supports equitation reasoning the introduced value is equal to expression that computes it
  def main(args: Array[String]): Unit =
    val defaultValue = if !args.isEmpty then args(0) else "Default value"

  


  




