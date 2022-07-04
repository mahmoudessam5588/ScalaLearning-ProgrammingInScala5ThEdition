package PatternMatching

object PatternOverlap {
  sealed trait Expr
  case class Var(name:String) extends Expr
  case class Num(number:Double) extends Expr
  case class Unop(operator:String,arg:Expr) extends Expr
  case class Binop(operator:String,left:Expr,right: Expr) extends Expr
  def simplifyAll(expr: Expr): Expr =
    expr match
      case Unop("-", Unop("-", e)) => simplifyAll(e) // ‘-' is its own inverse
      case Binop("+", e, Num(0)) => simplifyAll(e) // ‘0' is a neutral element for ‘+'
      case Binop("*", e, Num(1)) =>simplifyAll(e) // ‘1' is a neutral element for ‘*'
      case Unop(op, e) =>Unop(op, simplifyAll(e))
      case Binop(op, l, r) => Binop(op, simplifyAll(l), simplifyAll(r))
      case _ => expr
  def main (arg:Array[String]):Unit ={

  }


}
