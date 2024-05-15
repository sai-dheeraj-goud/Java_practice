package P1;

import java.util.*;

public class Pattern_star_rightangle_shape {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows=in.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);//if 'j' is replaced by '*', we will get all stars
			}
			System.out.println();
		}

	}

}
