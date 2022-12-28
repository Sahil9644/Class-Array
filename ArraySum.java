package array;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int s=0;
		System.out.println("Enter the number of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the elements: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("The sum is :");
		for(int i=0;i<n;i++){
			s=s+arr[i];
		}
		System.out.println(s);// TODO Auto-generated method stub

	}

}
