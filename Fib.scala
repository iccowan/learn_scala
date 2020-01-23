object Fib extends App {
  def fib(n : Int) : Int = {
    if(n <= 1) 1
    else fib(n - 1) + fib(n - 2)
  }

  (0 to 10).map(fib).foreach(println(_))
}