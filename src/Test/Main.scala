package Test
import chaptersIntro.{ControlStatementsAndRecursion, FunctionalObjectRationalNumberClass}

import scala.math.Fractional.*
import scala.math.Integral.*
import scala.math.Numeric.*

object Main:
  def main (args : Array[String]):Unit=
    val oneHalf =  FunctionalObjectRationalNumberClass(1,2)
    println(oneHalf)
    val twoThird =  FunctionalObjectRationalNumberClass(2,3)
    println(twoThird)
    println(oneHalf + twoThird)
    val y =  FunctionalObjectRationalNumberClass(3)
    println(y)
    val normalise =  FunctionalObjectRationalNumberClass(66,42)
    println(normalise)
    val res1 = (normalise + twoThird) * oneHalf
    val res2 = normalise + twoThird * oneHalf
    println(s"$res1 &&& $res2")
    println(res2 *3)
    
    

