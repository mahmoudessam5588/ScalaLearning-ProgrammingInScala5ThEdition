package chaptersIntro

import scala.collection.{immutable, mutable}

object TupleScala {
  // collections of different immutable types in parentheses and comma
  def main(args: Array[String]): Unit = {
    val pair = (99, "Softballs")
    println(pair(0))

    var jetSet: Set[String] = immutable.Set("Boeing", "Airbus")
    jetSet.+=("Lear")
    println(jetSet.contains("Cessna"))
    println(jetSet)

    var movieSet = mutable.Set("SpotLight", "Parasite", "StarWars")
    movieSet.+=("LordOfTheRings")

    val hashSet = mutable.HashSet("Tomatoes", "Cucumber")
    hashSet.+=("Coriander")

    val mapNumbers = mutable.HashMap("One" -> 1, "Two" -> 2, "Three" -> 3, "Four" -> 4)
    mapNumbers.+=("Five" -> 5)
    println(mapNumbers("Three"))


  }

}
