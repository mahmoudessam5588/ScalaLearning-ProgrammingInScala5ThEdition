package chaptersIntro

import scala.annotation.tailrec

object ForYield {
  def main (args:Array[String]):Unit =
    for i <- 1 until 4 yield println(i)
    val a:Array[String] = Array("Ahmed","Mohammed","Moustafa")
    for i<-a do println(i)

    @tailrec
    def searchFrom(i:Int):Int =
      if i >= args.length then -1
      else if args(i).startsWith("-") then  searchFrom(i+1)
      else if  args(i).endsWith(".scala") then i
      else searchFrom(i+1)
    val res = searchFrom(0)
}
