package CollectionsIntro.WorkingWithLists

import CollectionsIntro.WorkingWithLists.Lists.reverseLeft

import scala.::

object Lists {
  //lists are homogenous  Immutable and Have Recursive Structure (Linked List)
  //fast addition  and removal
  //work well with pattern matching
  val fruits:List[String] = List("Apple","Peach","Mango")
  val numbers:List[Int]=List(1,2,3,4,5,5)
  val empty :List[Any] = List()
  val nestedLists :List[List[Int]] = List(
    List(1,2,3,46,22),
    List(1,2,44,66,78)
  )
  val number: List[Int] = 1:: 2 ::(3::(4::Nil))
  val fruit: List[String] = "apples" :: ("oranges" :: ("pears" :: Nil))
  val a :: b :: rest = fruit

  def insert (x:Int , xs:List[Int]):List[Int] =
    xs match
      case List() => List(x)
      case y ::ys => if x<=y then x::xs
                    else y :: insert(x,ys)
  def iSort(xs:List[Int]):List[Int] =
    xs match
      case List() => List()
      case x::xs1 => insert(x,iSort(xs1))

  def append[T](xs:List[T],ys:List[T]):List[T]=
    xs match
      case List() => ys
      case x::xs1 =>x::append(xs1,ys)
  val concat: List[Int] = number ::: numbers

  //prefix and suffix
  //take => return first element of the list if  n > list.length the whole list is returned
  //drop => return all the element except the first element in the list if  n >  list.length an empty list is returned
  def hasZeroRow(m:List[List[Int]]): Boolean =
    m.exists(s=>s.forall(_==0))
  def reverseLeft[T](xs:List[T]): List[Any] =
    xs.foldLeft(List[T]())((ys,y)=>y::ys)



  def main (args:Array[String]):Unit =
    println(s"${fruit.head} , ${fruit.tail} , ${fruit.isEmpty}")
    println(number.sorted)
    println(s"$a , $b , $rest")
    println(concat.sorted)
    println(concat.tail)
    println(concat.init)
    println(concat.last)
    println(concat.reverse)

    println("---------")
    println(concat)
    println(concat.take(6))
    println(concat.take(0))
    println(concat.drop(0))
    println(concat.drop(6))
    println(concat.splitAt(5))

    println(List(List(1,2),List(3),List(6,4,5),List(55,67,23)).flatten.sorted)
    println(fruits.zip(fruit))
    val words = List("the","quick","brown","fox")
    println(words.map(_.toList.reverse.mkString(" ")))
    println(for i <- List.range(1,5) ; j <- List.range(1,i) yield (i,j))
    println(List.range(1,5).flatMap(i=>List.range(1,i).map(j=>(i,j))))
    println(concat.filter(_%2==0))
    println(words.filter(_.length==3))
    println(concat.partition(_%2==0))
    println(concat.findLast(_==5))
    println(concat.find(_==5))
    println(words.dropWhile(_.startsWith("t")))
    val t =numbers.takeWhile(_.!=(5))
    println(t)
    println(hasZeroRow(nestedLists))
    println(words.foldLeft("")(_ + " " + _))
    println(words.tail.foldLeft(words.head)(_ + " " + _))
    println("---------------------")
    println(words.foldRight("C")(_+""+_))
    println("----------------")
    println(concat.sortWith(_<_))
    println(words.sortWith(_<_))
    println(fruit.sortWith(_.length<_.length))
    println(reverseLeft(numbers))
    println(List.range(0,10,3))
    println(List.tabulate(5)(n=>n*(n-1)))
    println(List.tabulate(5,5)(_*_))
    println(List.concat(List("a","b","c"),List("d","e")))
    println(List.fill(5)(25))
    println(List(10,44,66).zip(List(67,89,90)).map{(x,y) => (x*y)/(x+y)}) //third element discarded





}
