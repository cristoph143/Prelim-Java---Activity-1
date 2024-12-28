
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ast,rows, columns, i, j;
        System.out.println("Enter Number of Astresisk");
        ast = sc.nextInt();
        for(i = 0; i < ast; i++)
        {
            for(j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println("");
        }
	sc = new Scanner(System.in);
		
	System.out.print(" Please Enter Number of Rows : ");
	rows = sc.nextInt();	
		
	System.out.print(" Please Enter Number of Columns : ");
	columns = sc.nextInt();	
		
	for(i = 1; i <= rows; i++)
	{
            for(j = 1; j <= columns; j++)
            {
		if(i == 1 || i == rows || j == 1 || j == columns)
		{
                    System.out.print("*"); 
		}
                else
                {
                    System.out.print(" "); 
                }
            }
            System.out.print("\n"); 
	}
    }
}
