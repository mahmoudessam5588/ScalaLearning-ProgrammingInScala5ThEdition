package chaptersIntro

import java.io.{FileNotFoundException, FileReader, IOException}


object ExceptionHandling :
  def main(args:Array[String]):Unit =
    def half (n:Int):Int =
      if n %2 == 0 then n else throw new RuntimeException("n Must be Even")
    half(2)
    val f =new  FileReader("input.txt")
    try
      println(f.read())
    catch
      case ex: FileNotFoundException => println(ex)
      case ex: IOException=> println(ex)
    finally
      f.close()

    val monthName  = if !args.isEmpty then args(0) else ""
      monthName match
        case jan => println("January")
        case feb => println("February")
        case mar => print("March")
        case ma => println("May")
        case jun => println("June")
        case jul => println("July")
        case aug => println("August")
        case _=> println("invalid")
    def makeRowSeq(row:Int) =
      for col <- 1 to 10 yield
        val prod  = (row*col).toString
        val padding = " " * (4-prod.length)
        padding + prod
    def makeRow(row:Int) = makeRowSeq(row).mkString
    def multiTable(): Unit =
      val tableSeq =
        for row <- 1 to 10 yield makeRow(row)
      println(tableSeq.mkString("\n"))
    multiTable()







