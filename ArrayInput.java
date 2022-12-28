package array;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		int arr[]=new int[10];
		System.out.println("Enter the number of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the elements: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("The elements are     " + arr[i]);
			
		}
	}

}
