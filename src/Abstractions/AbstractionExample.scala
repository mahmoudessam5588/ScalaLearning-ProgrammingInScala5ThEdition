package Abstractions

object AbstractionExample {
  trait AbstractTime:
    type  T
    def hour : T
    def hour_=(x:T):Unit
    def minute: T
    def minute_=(x:Int): Unit


}
