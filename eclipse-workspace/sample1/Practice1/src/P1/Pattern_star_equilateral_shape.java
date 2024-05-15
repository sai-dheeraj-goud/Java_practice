package P1;

import java.util.*;

public class Pattern_star_equilateral_shape {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int rows=in.nextInt();
		for(int i=0;i<=rows;i++)
		{
			for(int k=rows-i;k>0;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

//	     *
//  	* *
//     * * *
//    * * * *