package P1;
import java.util.*;
public class Pattern_star_rightangle_spaces_first {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter no. of rows");
		int rows=in.nextInt();
		for(int i=rows;i>0;i--)
		{
			for(int k=rows;k>i;k--)
				System.out.print(" ");
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
