package array;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int s,h;
		System.out.println("Enter the number of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the elements: ");
			arr[i]=sc.nextInt();
		}
		h=arr[0];
		s=arr[0];
		for(int i=0;i<n;i++)
		{
		   if(h>arr[i])
		   {
			   h=arr[i];
		   }
		}
		for(int i=0;i<n;i++)
		{
			if(s<arr[i])
			{
				s=arr[i];
			}
		}
		System.out.println("The highest Number is :"+s);
		System.out.println("The smallest Number is :"+h);
		// TODO Auto-generated method stub

	}

}
