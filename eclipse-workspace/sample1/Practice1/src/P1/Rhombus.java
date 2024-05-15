package P1;

import java.util.*;
public class Rhombus {

	public static void main(String[] args) {
		System.out.println("enter no. of rows");
		Scanner in=new Scanner(System.in);
		int rows=in.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int k=rows-i;k>0;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=rows-1;i>0;i--)
		{
			for(int k=rows-i;k>0;k--)
				System.out.print(" ");
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	

	}

}
