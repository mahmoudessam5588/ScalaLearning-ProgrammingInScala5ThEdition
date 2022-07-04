package ChapterTenth

object TraitsDemo {

  def main(array: Array[String]): Unit =
    val frog = new Frog
    frog.philosophical.foreach(println)
    val phil: Philosophical = frog
    val phrog: Philosophical = new Frog
    println(phil.philosophical)
    println(phrog.philosophical)

  trait Philosophical:
    def philosophical: String = "Know Your Enemies And Friends"

  trait Hassles

  class Animal

  class Frog extends Animal, Philosophical, Hassles :
    override def toString: String = "Greens"

    override def philosophical: String = s"Know your Enemies And $this"

}
