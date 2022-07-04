package TypeParamatization

object TypeParametrizationExample {
  /*
  * Unlike a mutable queue, a functional queue does not change its contents
when an element is appended. Instead, a new queue is returned that contains
the element. The goal of this chapter will be to create a class, which we’ll
name Queue, that works like this:*/
  class SlowAppendQueue[T](elems:List[T]):
    def head: T = elems.head
    def tail: SlowAppendQueue[T] =  SlowAppendQueue[T](elems.tail)
    def enqueue(x:T) = new  SlowAppendQueue(elems::List(x))
  class SlowHeadQueue[T](smele: List[T]): // Not efficient
  // smele is elems reversed
    def head: T = smele.last
    def tail = new SlowHeadQueue(smele.init)
    def enqueue(x: T): SlowHeadQueue[T] = SlowHeadQueue(x :: smele)

  def main(args: Array[String]): Unit = {


  }

}
