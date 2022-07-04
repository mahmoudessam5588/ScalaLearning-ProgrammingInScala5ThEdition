package CollectionsIntro.WorkingWithLists

import scala.collection.mutable.ListBuffer

object Listbuffers {
  /*
  * Class List provides fast access to the head of the list, but not the end. Thus,
when you need to build a list by appending to the end, consider building the
list backwards by prepending elements to the front. Then when you’re done,
call reverse to get the elements in the order you need.
Another alternative, which avoids the reverse operation, is to use a
ListBuffer. A ListBuffer is a mutable object (contained in package
scala.collection.mutable), which can help you build lists more efficiently when you need to append.
* Another reason to use ListBuffer instead of List is to prevent the potential for stack overflow. If you can build a list in the desired order by
prepending, but the recursive algorithm that would be required is not tail
recursive, you can use a for expression or while loop and a ListBuffer
instead. You can see ListBuffer being used in this way in Advanced Programming in Scala.*/

  val buf = new ListBuffer[Int]
  buf += 1
  // ListBuffer(1)
  buf += 2
  // ListBuffer(1, 2)
  3 +=: buf
  // ListBuffer(3, 1, 2)
  buf.toList
  // List(3, 1, 2)

}
