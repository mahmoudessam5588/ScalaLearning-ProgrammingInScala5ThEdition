package ChapterEightFunctionsAndClosures

import javax.swing.JButton

object SamTypesWithTrait {

  trait Increased:
    def increase(i: Int): Int

  def increaseByOne(increased: Increased): Int =
    increased.increase(1)

  increaseByOne(
    i => i + 7
  )
  val button = new JButton
  button.addActionListener(
    _ => println("Pressed")
  )


}
