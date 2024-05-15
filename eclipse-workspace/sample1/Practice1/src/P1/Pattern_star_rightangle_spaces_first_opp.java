package P1;

import java.util.*;
public class Pattern_star_rightangle_spaces_first_opp {

	public static void main(String[] args) {
		System.out.println("enter no. of rows");
		Scanner in=new Scanner(System.in);
		int rows=in.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int k=rows;k>i;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
