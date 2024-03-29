package part1

object Functions extends App {


  //1.

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  //2.

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction())
  println(aParameterLessFunction)


  // 3.

  def aRepeatedFunction(str: String, n: Int): String = {
    if (n == 1) str;
    else str + aRepeatedFunction(str, n - 1);
  }

  println(aRepeatedFunction("hello", 3))


  // Ex :  Factorial function 1 * 2 * 3 * .. * n


  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(5))


  // Imp-Note :   WHEN YOU NEED LOOPS, USE RECURSION.


  // 4.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  // 5.

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }


  //6. CBN & CBV


  def calledByValue(x: Long): Unit = {
    println("by value " + x)
    println("by value " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name " + x)
    println("by name " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


  // 7. Default/Named Args

  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc;
    else trFact(n - 1, n * acc)


  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")

  savePicture(width = 800)




}
