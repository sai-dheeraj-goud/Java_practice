package P1;

import java.util.*;

public class Pattern_star_rightangle_Opposite {

	public static void main(String[] args) {
		System.out.println("enter no. of rows");
		Scanner in =new Scanner(System.in);
		int rows=in.nextInt();
		for(int i=rows;i>0;i--)
			{
				for(int j=i;j>0;j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
