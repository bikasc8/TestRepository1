public class test
{
  public static void main(String args[])
  {
    int a = 2, b=3;
    System.out.println("Hi");
    System.out.println(a +" + " + b + " = " + sum(a,b));
  }
  public static int sum(int a, int b)
  {
    int result=0;
    result= a + b;
    return result;
  }
}