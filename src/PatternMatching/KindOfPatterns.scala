package PatternMatching

object KindOfPatterns {
  //wildcard patterns (_)
  trait EvaluateArrays
  case class arrayStrings(str:Array[String]) extends EvaluateArrays
  case class arrayOfInts(int: Array[Int])extends EvaluateArrays
  case class arrayOfObj(obj: Array[Any]) extends EvaluateArrays
  def filterTypes(evaluate: EvaluateArrays):String=
    evaluate match //can do same with tuples
      case arrayStrings(Array("A","B","C")) => s"Array of Strings: $arrayStrings"
      case arrayOfInts(Array(_,_,_)) => s"Array Of Ints: $arrayOfInts" //sequence pattern
      case arrayOfInts(Array(_,_, _*)) => s"Array of Ints with: astrikes $arrayOfObj"
      //case 5 => "five" constant pattern
      case arrayOfObj(Array(_,_,_*)) => s"Array Of obj passing there parameters with card $arrayOfObj"
      case _ => "Other"
  def main(arg:Array[String]):Unit =
    val str = arrayStrings(Array("C","B","C"))
    println(filterTypes(str))
    val obj = arrayOfObj(Array(1,1.5,"A","B"))
    println(filterTypes(obj))
    val ints = arrayOfInts(Array(2,3,4,345,4,6,57,6))
    val int = arrayOfInts(Array(2,3,4))
    println(filterTypes(ints))
    println(filterTypes(int))



}
