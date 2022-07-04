package ChapterTenth

import ChapterTenth.Elements.*

object Elementz:

  def elem(contents: Vector[String]): Element = VectorElement(contents)

  def elem(chr: Char, width: Int, height: Int): Element = UniformElement(chr, width, height)

  def elem(line: String): Element = LineElement(line)

  private class VectorElement(override val contents: Vector[String]) extends Element

  private class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element :
    override def contents: Vector[String] = Vector.fill(height)(ch.toString * width)

  private class LineElement(s: String) extends Element :
    override val width: Int = s.length
    override val height: Int = 1
    override val contents: Vector[String] = Vector(s)


