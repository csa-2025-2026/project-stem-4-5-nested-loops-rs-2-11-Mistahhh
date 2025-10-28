import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a number: ");
    int N = scan.nextInt();
    uprightNumberTriangle(N);
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String currentLetter = word.substring(i,i+1);
      for (int j=0; j < N; j++)
      {
        System.outprintln(currentLetter);
      }
      System.out.println();
    }
  }

  public static void printNums()
  {
    for (int row = 10; row >= -1; row--)
    {
      for (int num = 1; num <= row; num++)
      {
        System.out.print(row + " ");  
      }
      System.out.println(); 
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int row = 1; row <= N; row++)
    {
      for (int num = 1; num <= row; num++)
      {
        System.out.print(row + " ");  
      }
      System.out.println(); 
    }
  }

  public static void starTree()
  {
    int N = 9;

    for (int row = 0; row < N; row++)
    {
      for (int blank = 0; blank < row; blank++)
      {
        System.out.print(" ");
      }
      for (int star = row; star < N; star++)
      {
        System.out.print("* ");
      }
        System.out.println();
    }
  }
  public static void multTable()
  {
    for (int row = 1; row <= 10; row++)
    {
      for (int num = 1; num <= 10; num++)
      {
        int nextNum = (row * num);
        System.out.print(nextNum + " ");
      }
      System.out.println();
    }
  }
}
