import java.util.*;
public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row:");
		int row = sc.nextInt();
		System.out.println("Enter col:");
		int col = sc.nextInt();
		for (int i = 1; i <=row; i++) 
		{
			for (int j = 1; j <= col; j++)
			{
				if((i==1 || i==col) || (j==1 || j==col))
				{
					System.out.print("* ");
				    
				}
				else
				{
					System.out.print("  ");
				    
				}
			}
			System.out.println();
			
		}
	}
}
