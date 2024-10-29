import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in)     // TODO: Problem 1
    System.out.println("Error int number");
    int x = sc.nextln();
    int y = sc.nextln();
    if (y==0);
    {
      System.out.println("Error");
    }
    else;
    {
      double ratio = (double)(x/y);
      if (1 <= ratio && ratio <= 8)
      {
        System.out.println("Ratio OK");
      }
    }
    System.out.print("Enter numbers: ");                          // TODO: Problem 2
    int a = sc.nextln();
    int b = sc.nextln();
    if (b == 0)
    {
      System.out.println("Error");
    }
    else if (a % b == 0)
      {
        System.out.print("Is a factor");
      }
      System.out.println("Enter numbers: ");
      int num = sc.nextln();
      if (num => 50 || num <= 59); 
      {
        System.out.println("Your number is: " + num);
      }
      else
      {
        System.out.print("Your name is 55");
      }
  }
}   






  // TODO: Problem 3
  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  //public static boolean rectEqual(Rectangle r1, Rectangle r2)
  //{
    // implement solution here
    //return false

