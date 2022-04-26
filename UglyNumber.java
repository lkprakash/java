import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    boolean flag=true;
    while(a!=1)
    {
      if(a%2==0)
      {
        a/=2;
      }
      else if(a%3==0)
      {
        a/=3;
      }
      else if(a%5==0)
      {
        a/=5;
      }
      else
      {
        flag=false;
        break;
      }
    }
    if(flag)
    {
      System.out.println("Ugly Number");
    }
    else
    {
      System.out.println("Not a Ugly Number");
    }
  }
}
