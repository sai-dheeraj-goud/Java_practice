package P1;

import java.util.ArrayList;
import java.util.List;

public class Even_and_Odd_addition {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,0};
		List<Integer> even=new ArrayList<Integer>();
		List<Integer> odd=new ArrayList<Integer>();
		int sum_even=0,sum_odd=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
				even.add(a[i]);
			else
				odd.add(a[i]);
		}
		System.out.println("even="+even);
		System.out.println("odd="+odd);
		for(int i=0;i<=even.size()-1;i++)
		{
			sum_even=even.get(i)+sum_even;
		}
		for(int i=0;i<=odd.size()-1;i++)
		{
			sum_odd=odd.get(i)+sum_odd;
		}
		System.out.println("sum_even="+sum_even);
		System.out.println("sum_odd="+sum_odd);
		if(sum_even>sum_odd)
			System.out.println("even numbers sum is more");
		else
			System.out.println("odd numbers sum is more");

	}

}
