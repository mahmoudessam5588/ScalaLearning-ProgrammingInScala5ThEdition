package chaptersIntro

object IterationLooping {
  def main(args: Array[String]): Unit = {
    def prints(args: String*): Unit =
      var i = 0
      while i < args.length do
        if i != 0 then
          print(" ")
        println(args(i))
        i += 1
      println()

    prints("Scala Is Fun")

    def forEachIteration(args: String*): Unit =
      args.foreach(println)

    forEachIteration("Scala Is Even More Fun")

    // imperative way
    def printArgs(args: List[String]): Unit =
      args.foreach(println)

    printArgs(List("h", "t", "r"))

    //less side effects
    def format(args: List[String]): String = args.mkString("\n")

    val res = format(List("h", "t"))
    assert(res == "h\nt")

  }
}
