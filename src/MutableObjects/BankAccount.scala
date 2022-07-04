package MutableObjects

class BankAccount {
  private var bal : Int = 0
  def balance :Int = bal
  def deposit(amount :Int):Unit =
    require(amount>0)
    bal += amount
  def withdraw(amount :Int):Boolean=
    if amount > bal then return false
    else bal -= amount
    true
  class Time :
    private var h = 0
    private var m = 0
    def hour :Int = h
    def hour_=(x:Int): Unit =
      require(0<=x && x <24)
      h =x
    def minutes :Int = m
    def minutes_=(x:Int):Unit =
      require(0<=x && x<60)
      m =x

}
