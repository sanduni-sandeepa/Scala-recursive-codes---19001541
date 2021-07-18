import scala.io.StdIn._
import java.util.Scanner;

object Q04 {

  def isEven(num:Int):Boolean= num match{
    case 0 => true
    case _ => isOdd(num-1)
  }

  def isOdd(num:Int):Boolean = !(isEven(num))

  def main(args: Array[String]) {

    print("Enter the number to check is it even or odd \nNumber : ") ;

    var input = new Scanner (System.in);
    val number = input.nextInt();
    val n =  isEven(number)

    if (n==true)
      println(number + " is Even")
    else
      println(number + " is Odd")
  }

}
