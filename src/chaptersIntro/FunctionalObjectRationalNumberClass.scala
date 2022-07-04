package chaptersIntro

import scala.annotation.{tailrec, targetName}

class FunctionalObjectRationalNumberClass(n: Int, d: Int) extends Ordered[FunctionalObjectRationalNumberClass] :
  val numer: Int = n / g

  /*
  * Immutable Trade offs
  * advantages
  *easier to reason don't change over time or have complex state space
  * passing immutable objects freely no need to make defensive copies as in the case of mutable objects
  * no way of two threads to concurrently access the same an immutable object to corrupt it's state ones it's constructed
  * make safe hash table keys
  * disadvantages
  * sometimes require large object graph to be copied whereas an update could be done in its place that can lead to performance bottleneck  */
  require(d != 0)
  val denom: Int = d / g
  private val g = gcd(n.abs, d.abs)

  override def compare(that: FunctionalObjectRationalNumberClass): Int = (this.numer * that.denom) - (that.numer * this.denom)

  def this(n: Int) = this(n, 1)

  def +(that: FunctionalObjectRationalNumberClass): FunctionalObjectRationalNumberClass =
    chaptersIntro.FunctionalObjectRationalNumberClass(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def +(i: Int): FunctionalObjectRationalNumberClass =
    chaptersIntro.FunctionalObjectRationalNumberClass(numer + i * denom, denom)

  def -(that: FunctionalObjectRationalNumberClass): FunctionalObjectRationalNumberClass =
    chaptersIntro.FunctionalObjectRationalNumberClass(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def -(i: Int): FunctionalObjectRationalNumberClass =
    chaptersIntro.FunctionalObjectRationalNumberClass(numer - i * denom, denom)

  def *(that: FunctionalObjectRationalNumberClass): FunctionalObjectRationalNumberClass =
    chaptersIntro.FunctionalObjectRationalNumberClass(numer * that.numer, denom * that.denom)

  def *(i: Int): FunctionalObjectRationalNumberClass =
    chaptersIntro.FunctionalObjectRationalNumberClass(numer * i, denom)

  def /(that: FunctionalObjectRationalNumberClass): FunctionalObjectRationalNumberClass =
    chaptersIntro.FunctionalObjectRationalNumberClass(numer * that.denom, denom * that.numer)

  def /(i: Int): FunctionalObjectRationalNumberClass =
    chaptersIntro.FunctionalObjectRationalNumberClass(numer, denom * i)

  override def toString = s"$numer/$denom"

  @tailrec
  private def gcd(a: Int, b: Int): Int =
    if b == 0 then a else gcd(b, a % b)



