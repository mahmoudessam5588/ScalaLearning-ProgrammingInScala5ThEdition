package CollectionsIntro.WorkingWithLists
import scala.collection.mutable.ArrayBuffer

object ArrayBuffers {
/*
* An ArrayBuffer is like an array, except that you can additionally add and
remove elements from the beginning and end of the sequence. All Array
operations are available, though they are a little slower due to a layer of
wrapping in the implementation. The new addition and removal operations
are constant time on average, but occasionally require linear time due to the
implementation needing to allocate a new array to hold the buffer’s contents.
To use an ArrayBuffer, you must first import it from the mutable collections package:*/
val buf = new ArrayBuffer[Int]()
  buf += 12
  // ArrayBuffer(12)
  buf += 15
  // ArrayBuffer(12, 15)
}
