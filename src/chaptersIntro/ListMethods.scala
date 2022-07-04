package chaptersIntro

object ListMethods {
  //lists are immutable of same type
  def main(args: Array[String]): Unit = {
    val thrill: List[String] = "Will" :: "Fill" :: "Until" :: Nil
    println(thrill(2))
    println(thrill.count(s => s.length == 4))
    println(thrill.drop(2))
    println(thrill.dropRight(2))
    println(thrill.contains("Until"))
    println(thrill.foreach(println))
    println(thrill.filter(s => s.endsWith("ll")))
    println(thrill.filter(s => s.endsWith("ll")))
    println(thrill.forall(s => s.isBlank))
    println(thrill.head)
    println(thrill.init)
    println(thrill.isEmpty)
    println(thrill.last)
    println(thrill.map(s => s + "lly"))
    println(thrill.mkString(" , "))
    println(thrill.filterNot(c => c.endsWith("ll")))
    println(thrill.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower))
    println(thrill.sorted)
    println(thrill.reverse)
    println(thrill.tail)


  }

}
