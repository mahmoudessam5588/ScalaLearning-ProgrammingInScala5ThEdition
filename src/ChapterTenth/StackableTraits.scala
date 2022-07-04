package ChapterTenth

import scala.collection.mutable.ArrayBuffer

object StackableTraits {
  def main(args: Array[String]): Unit =
    val queue = new BasicIntQueue
    queue.put(10)
    queue.put(20)
    queue.get()
    queue.get()
    val myQueue = new MyQueue with Doubling
    myQueue.put(10)
    println(myQueue.get())
    val result = new BasicIntQueue with Increment with Filtering
    result.put(-10)
    result.put(34)
    result.put(23)
    result.get()
    result.get()
    result.get()

  trait Doubling extends IntQueue :
    override abstract def put(x: Int): Unit = super.put(2 * x)

  trait Increment extends IntQueue :
    override abstract def put(x: Int): Unit = super.put(x + 1)

  trait Filtering extends IntQueue :
    override abstract def put(x: Int): Unit = if x >= 0 then super.put(x)

  abstract class IntQueue:
    def get(): Int

    def put(x: Int): Unit

  class MyQueue extends BasicIntQueue :

  end MyQueue

  class BasicIntQueue extends IntQueue :
    private val buf = ArrayBuffer.empty[Int]

    override def get(): Int = buf.remove(0)

    override def put(x: Int): Unit = buf += x

}
