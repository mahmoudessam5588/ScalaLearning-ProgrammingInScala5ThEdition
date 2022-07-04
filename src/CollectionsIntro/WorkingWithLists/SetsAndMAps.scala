package CollectionsIntro.WorkingWithLists

import scala.collection.immutable.TreeSet

object SetsAndMAps {
  object Predef:
    type Map[A, +B] = collection.immutable.Map[A, B]
    type Set[A] = collection.immutable.Set[A]
    val Map = collection.immutable.Map
    val Set = collection.immutable.Set
  end Predef
  //set contain homogenous collections of distinct elements doesn't allow duplication of the code
  //consider the following example you split a string with comma in every space or punctuation then we need to count the number of words after each comma
  val text = "My Name. Is Mahmoud"
  val wordsArray: Set[String] = text.split("[ !,.]+").toSet
  def main (args:Array[String]):Unit ={
    println(wordsArray)
    for word <- wordsArray yield println(word.toCharArray.mkString("[ ",""," ]"))
    val numbers: Set[Int] = Set(1, 2, 3, 4, 5)
    println(numbers+5)
    println(numbers-3)
    println(numbers++List(6,7,8))
    println(numbers--List(1,2,3))
    println(numbers&Set(1,3,5,7))
    println(numbers.size)
    println(numbers.contains(4))
    import scala.collection.mutable
    val words = mutable.Set.empty[String]
    println(words+="the")
    println(words-="the")
    println(words++=mutable.Set("the" ,"cat" ,"is" ,"fat"))
    println(words--=mutable.Set("the" ,"cat"))
    println(words.clear)
    var people = collection.immutable.Set("Ahmed","Mohammed")
    people += "yasser"
    people -= "yasser"
    people ++= List("Yasser","Ayman")
    println(people)
    val colors:List[String] = List("C" ,"B","A")
    println(colors.toArray.mkString("Array(", ", ", ")"))
    val treeColor:TreeSet[String] = colors to TreeSet
    println(treeColor.toArray.mkString("Array(", ", ", ")"))





  }


}
