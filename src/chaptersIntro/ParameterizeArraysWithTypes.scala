package chaptersIntro

object ParameterizeArraysWithTypes {
  def main(args: Array[String]): Unit =
    val arrayOfStr: Array[String] = new Array[String](3)
    arrayOfStr(0) = "hello "
    arrayOfStr(1) = " Are You"
    arrayOfStr(2) = " There"
    for i <- 0 to 2 do print(arrayOfStr(i))
    print("\n----------")
    val arrayList: Array[String] =
      Array.apply("One", "Two", "Three")
    println("\n" + arrayList.toList)

    val listOneTwo: List[Int] = List(1, 2)
    val listThreeFour: List[Int] = List(3, 4)
    val listOneTwoThreeFour: List[Int] = listOneTwo ::: listThreeFour
    print(listOneTwoThreeFour)


    val alphabet: List[String] = "A" :: List("B", "c")
    print("\n" + alphabet)

}
