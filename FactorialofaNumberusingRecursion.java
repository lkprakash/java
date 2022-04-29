import java.util.*;
class Main{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args){
    int a=sc.nextInt();
    System.out.println(n_digit(a));
  }
  static int n_digit(int n)
  {
    if(n<=1){
      return 1;
    }else{
      return n*n_digit(n-1);
    }
  }
}
