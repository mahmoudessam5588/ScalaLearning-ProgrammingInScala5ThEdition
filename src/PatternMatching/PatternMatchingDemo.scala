package PatternMatching

object PatternMatchingDemo {
  trait Expr
  case class Var(name:String) extends Expr
  case class Num(number:Double) extends Expr
  case class Unop(operator:String,arg:Expr) extends Expr
  case class Binop(operator:String,left:Expr,right: Expr) extends Expr
  def simplyTop(expr: Expr):Expr= //constructor pattern
    expr match
      case Unop("-", Unop("-",e)) => e //double negation
      case Binop("+", e, Num(0)) => e //adding zero
      case  Binop("*", e, Num(1)) => e
      case Unop("abs",e@ Unop("abs", _)) => e //variable Binding
      case Binop("+", x, y) if x == y => Binop("*", x, Num(2)) // pattern guard
      case _ => expr
  def main(args:Array[String]):Unit =
    val v = Var("x")
    val op = Binop("+",Num(1),v)
    println(v.name)
    println(op.left)
    println(op.toString)
    println(op.right==Var("x"))
    val newOperator = op.copy(operator="-")
    println(newOperator.toString)
    println(simplyTop(Unop("-",Unop("-",Var("x")))))
    println(simplyTop(Binop("*",Unop("+",Var("y")),Binop("*",Unop("+",Var("y")),Num(20.8)))))
    println(simplyTop(Unop("abs",Unop("abs",Var("Hi")))))

}
