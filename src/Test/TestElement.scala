package Test
import ChapterTenth.Elementz
import ChapterTenth.Elements

object TestElement {

  def main(args:Array[String]):Unit=
    println(Elementz.elem(Vector("Hi","There","Now")).above(Elementz.elem(Vector(" Ahmed"," are the Keys"," Let's take a ride"))))
    val adjectives = List("One", "Two", "Red", "Blue")
    val nouns = adjectives.map(_ + " Fish")
    println(nouns)
    val noun = for adj <- adjectives yield adj +" fish"
    println(noun)
    val withDefault :Option[Int] =>Int =
      case Some (x) => x
      case None => 0
    println(withDefault(Some(10)))
    println(withDefault(None))
    val myTuple =(123,"abc")
    val (number ,string) = myTuple
    println(s"$number ,$string")  
    







}
