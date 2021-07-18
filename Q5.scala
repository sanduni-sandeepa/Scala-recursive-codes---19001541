import scala.io.StdIn._
import java.util.Scanner;

object Q05 {

  def main(args: Array[String]) {

    print("Enter the number to get addition even numbers between of 1 to n \nNumber : ") ;

    var input = new Scanner (System.in) ;
    val number = input.nextInt() ;

    println(add_Even_Numbers(number)) ;

  }


  def isEven(num:Int):Boolean= num match{
    case 0 => true
    case _ => isOdd(num-1)
  }

  def isOdd(num:Int):Boolean = !(isEven(num))

  def add_Even_Numbers(m:Int, n:Int=0): Int=m match {

    case 0 => n
    case x if (isEven(x)) => add_Even_Numbers((m-1),(n+m))
    case x if (isOdd(x)) => add_Even_Numbers((m-1),(n))

  }
}
