import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int i,j,rows,columns;
    System.out.println("Enter row:");
    rows=sc.nextInt();
    System.out.println("Enter col:");
    columns=sc.nextInt();
    for(i=1;i<=rows;i++)
    {
      for(j=1;j<=columns;j++)
      {
        if(i==1||i==rows||j==1||j==columns)
        {
          System.out.print("1");
        }else
        {
          System.out.print("0");
        }
      }
      
      System.out.print("\n");
    }
  }
}
