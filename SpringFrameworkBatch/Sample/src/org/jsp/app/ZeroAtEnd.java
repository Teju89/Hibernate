package org.jsp.app;

import java.util.Iterator;
import java.util.Scanner;

public class ZeroAtEnd 
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
		int []temp = new int[size];
		int index = 0;
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i] != 0)
			{
				temp[index++] = array[i];
			}
		}
		System.out.println("Final Output...");
		for (int i = 0; i < temp.length; i++) 
		{
			System.out.println(temp[i]);
		}
	}

}
