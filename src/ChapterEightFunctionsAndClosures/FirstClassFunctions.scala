package ChapterEightFunctionsAndClosures

object FirstClassFunctions {
  val addTwo: Int => Int = (x: Int) => x + 1
  val addTwos: Int => Int = (x: Int) => {
    val increment = 2
    x + increment
  }

  def main(args: Array[String]): Unit =
    addTwo(2)
    addTwos(3)
    Array[String]("Ahmed", " Mohamed").foreach(x => println(x.mkString(" ")))
    List(1, 2, 3, 4, 5, 6, 7).filter((x: Int) => x >= 4).foreach(println)
    List(1, 2, 3, 4, 5, 6, 7).filter(_ >= 2).foreach(println)

    //partially applied functions
    def sum(a: Int, b: Int, c: Int): Int = a + b + c

    val summed = sum _
    println(summed(33, 545, 56))
    val partial = sum(10, _, 30)
    println(partial.apply(20))
    println(partial)
    //closures
    val more = 999
    val addMore = (x: Int) => x + more
    println(addMore(20))
    val someNumbers = List(10, 20, 30, 40)
    var sums = 0
    someNumbers.foreach(sums += _)
    println(sums)
    println(someNumbers)

    def makeIncrease(more: Int) = (x:Int)=> x  + more

    val resT22 = makeIncrease(10)
    println(resT22(10))

    //repeated parameters
    def echo(args: String*): Unit = for arg <- args do println(arg)

    val seq = Seq("What's , It's ,Up")

    echo(seq *)


}
