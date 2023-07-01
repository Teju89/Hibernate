package org.jsp.app;

import java.util.Scanner;

public class PallindromeSubArray 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Elements: ");
		int size = sc.nextInt();
		int [] array = new int[size];
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("Enter " + (i+1) + " element");
			array[i] = sc.nextInt();
		}
		boolean status = false;
		for (int i = 0; i < array.length-1; i++)
		{
			int sum = 0;
			int temp = 0;
			for (int j = 0; j < array.length; j++) 
			{
				int rev = 0;
				if(i != j)
				{
					sum = array[i] + array[j];
					temp = sum;
					while(sum != 0)
					{
						rev = rev * 10 + sum%10;
						sum /= 10;
					}
					//System.out.println(rev);
					if(rev == temp)
					{
						status = true;
						break;
					}
				}
			}
		}
		if(status)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
