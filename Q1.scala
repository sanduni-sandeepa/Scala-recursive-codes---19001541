import scala.io.StdIn._

object Q01 {

  def main(args : Array[String]){

    print("Enter the number to check is it prime number or not : ") ;

    val number = scala.io.StdIn.readInt() ;

    if(prime(number)){
      println(number +" is a prime number") ;
    }
    else{
      println(number +" is not a prime number")
    }

  }

  def gcd(x:Int ,y:Int):Int = y match{
    case 0 => x
    case y if (y>x) => gcd(y,x)
    case _ => gcd(y,x%y)

  }

  def prime(p:Int ,q:Int=2):Boolean = q match{
    case x if(p==x) => true
    case x if (p==1) => false
    case x if(gcd(p,x)>1) => false
    case x => prime(p,x+1)
  }

}


