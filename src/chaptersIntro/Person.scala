package chaptersIntro

case class Person(name:String,age:Int):
  //create companion object and create factory method {val p = Chapters.Person("Ali",35)}
  //store all class parameters in fields and generate accessor methods with the name parameters {p.name , p.age}
  //implement to string method {p.toString}
  //implement Hashcode and Equally
  def addSuffix(suffix:String):Person =
    Person(s"$name$suffix",age)
object Person:
  def apply(name: String, age: Int): Person =
    val capitalizedName =
      if name.nonEmpty then
        val firstChar = name.charAt(0).toUpper
        val restOfName = name.substring(1)
        s"$firstChar$restOfName"
      else throw new IllegalArgumentException("Empty name")
    new Person(capitalizedName, age)

