package ChapterTenth

import ChapterTenth.Elementz.*

object Elements {

  abstract class Element:
    val height: Int = contents.length
    val width: Int = if height == 0 then 0 else contents(0).length

    def contents: Vector[String]

    def above(concatTo: Element): Element =
      elem(for (line1, line2) <- this.contents.zip(concatTo.contents) yield line1 + line2)

    override def toString: String = contents.mkString("\n")
    
  end Element


}







