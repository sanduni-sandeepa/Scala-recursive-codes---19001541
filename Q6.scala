import scala.io.StdIn._
import java.util.Scanner;

object Q06 {

  def main(args: Array[String]) {

      print("To take first n numbers of fibonacci sequence\nEnter Number : ") ;
      var input = new Scanner (System.in) ;
      val number = input.nextInt() ;
      println("First  "+number + " numbers of Fibonacci sequence ") ;

      fibonacciSeq(number)
  }

  def fibonacci(n:Int):Int= n match{
      case 0 => 0
      case x if x==1 => 1
      case _ => fibonacci(n-1)+fibonacci(n-2)
    }

  def fibonacciSeq(n:Int):Unit= {
      if (n > 0) fibonacciSeq(n-1)
      println(fibonacci(n))
    }

}
