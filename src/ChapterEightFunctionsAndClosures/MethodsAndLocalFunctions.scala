package ChapterEightFunctionsAndClosures



object MethodsAndLocalFunctions {
  def padLines(text: String, minWidth: Int): String =
    def padLine(line: String): String = //local function better than private imp.
      if line.length >= minWidth then line
      else line + " " * (minWidth - line.length)
    val paddedLines =
      for line <- text.linesIterator yield padLine(line)
    paddedLines.mkString("\n")



}
