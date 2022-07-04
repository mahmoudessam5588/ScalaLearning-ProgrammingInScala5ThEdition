package chaptersIntro

object ImperativeMapsAndForYield:
  def main(args: Array[String]): Unit =
    //adding element to the list
    val num: List[String] = List("One", "Two", "Three", "Four") //also work with vector
    val additionByMap = num.map(s => s.+(" Six"))
    println(additionByMap)

    val additionByYield: List[String] = for i <- num yield i.+(" Six")
    println(additionByYield)

    val toLowerVector: Vector[String] = Vector("Ahmed", "Mohammed", "Omar")
    val mapResult = toLowerVector.map(s => s.toLowerCase)
    println(mapResult)

    val yieldResult = for add <- toLowerVector yield add.toLowerCase
    println(yieldResult)

    val searchStartWith = toLowerVector.find(q => q.startsWith("M"))
    println(searchStartWith)
    print(searchStartWith.map(n => n.toLowerCase))
    //Or
    for word <- searchStartWith yield word.toLowerCase
