package Enums

object Enums {
  enum Direction:
    case North , South , East ,West
  enum Directions(val degrees:Int):
    case North extends Directions(0)
    case South extends Directions(180)
    case East extends Directions(90)
    case West extends Directions(270)
  enum  EastWood[+G,+B]:
    def map[G2](f:G=>G2):EastWood[G2,B]=
    this match
      case Good(g) => Good(f(g))
      case Bad(b) => Bad(b)
      case Ugly(ex) => Ugly(ex)
    case Good(g:G)
    case Bad(b:B)
    case Ugly(ex:Throwable)

   enum Literal[T]:
      case IntLit(value:Int) extends  Literal[Int]
      case LongLit(value:Long) extends Literal[Long]
      case CharLit(value:Char) extends Literal[Char]
    import Literal.*
    def valueOfLiteral[T](lit:Literal[T]):T=
      lit match
        case IntLit(n)=>n
        case LongLit(m)=>m
        case CharLit(c)=>c

  import Direction.{North,South,East,West}
  def invert (dir :Direction):Direction =
    dir match
      case North => South
      case East => West
      case South => North
      case West => East
  def main (args:Array[String]):Unit=
    println(invert(North))
    println(North.ordinal)
    println(Direction.valueOf("North"))
    import Directions.*
    println(Directions.North.degrees)
    import EastWood.*
    val eastwood = Good(42)
    println(eastwood.map(_+1))
    import Literal.*

    println(valueOfLiteral(IntLit(30)))

}
