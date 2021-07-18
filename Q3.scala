import scala.io.StdIn._
import java.util.Scanner;

object Q03 {

  def main(args:Array[String]){

    var input = new Scanner (System.in) ;

    print("To get addition of numbers from 1 to n\n") ;
    print("Enter number : ") ;

    val number = input.nextInt() ;

    print("Addition of numbers from 1 to " + number + " = ") ;
    println(add_Number(number)) ;

  }
  def add_Number(m:Int, n:Int=0): Int=m match{
    case 0 => n
    case x if x>0 => add_Number((m-1),(m+n))
  }

}
