import java.io.File
import java.util.Date
import javax.management.Query

object ChapterNineControlAbstractions {
  private def filesHere = (new File(".")).listFiles
  def filesMatching(matcher:(String)=>Boolean):Unit =
    for file <- filesHere if matcher(file.getName)
      yield file
  def fileEndingWith(query:String): Unit =
    filesMatching(_.endsWith(query))
  def filesContains(query: String):Unit =
    filesMatching(_.contains(query))
  def filesRegex(query: String):Unit =
    filesMatching(_.matches(query))
  def containingNig(numbers:List[Int]): Boolean = numbers.exists(_>5)
  def oddNumbers(numbers:List[Int]):Boolean = numbers.exists(_%2==1)

  //understanding curring
  def curriedSum(x:Int)(y:Int) :Int= x+y
  //explained in detail below
  def first(x:Int): Int => Int = (y:Int)  => x+y
  val second: Int => Int = first(1)
  def main (args:Array[String]):Unit =
    val res: Boolean = containingNig(List(1,2,3,4,5,6,7,8,78))
    println(res)
    val exists :Boolean = oddNumbers(List(2,4,6,8,10))
    println(exists)
    println(curriedSum(3)(3))
    println(second(2))





}
