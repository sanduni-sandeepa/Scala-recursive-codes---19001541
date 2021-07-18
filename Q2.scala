import scala.io.StdIn._
import scala.collection.immutable._

object Q02 {

  def main(args: Array[String]) {
    println("To get prime numbers between 1 to n numbers") ;
    print("Enter the number : ") ;

    val number = scala.io.StdIn.readInt() ;

    print("prime numbers between 0 - " + number + "\n")

    primeSeq(number) ;

    print("\n") ;

  }

  def gcd(x: Int, y: Int): Int = y match {
    case 0 => x
    case y if (y > x) => gcd(y, x)
    case _ => gcd(y, x % y)

  }

  def prime(n: Int, m: Int = 2): Boolean = m match {
    case x if (n == x) => true
    case x if (gcd(n, x) > 1) => false
    case x => prime(n, x + 1)
  }

  def primeSeq(n: Int) {
    if (n > 2)
      primeSeq(n - 1) ;
    val p = prime(n) ;
    if (p == true)
      print(n + " ") ;
  }

}

