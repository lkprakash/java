import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row,col,i,j;
        int a,b;
        System.out.println("Enter row:");
        row=sc.nextInt();
        System.out.println("Enter col:");
        col=sc.nextInt();
        a=(row+1)/2;
        b=(col+1)/2;
        for(i=1;i<=row;i++){
            for(j=1;j<=col;j++){
                if(b==j||a==i){
                    System.out.print("0");
                }else if((col%2==0&&b+1==j)||(row%2==0&&a+1==i)){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.print("\n");
        }
    }
}
