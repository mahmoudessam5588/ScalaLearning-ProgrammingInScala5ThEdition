package chaptersIntro

object TestMain:
  def main(args: Array[String]): Unit =
    val res = new ObjectClasses().ObjectClasses.calculate("Ahmed").toList
    println(res)
    val q = Person("sally", 29)
    println(q.addSuffix(" Smith"))
