package array;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int s,c=0;
		System.out.println("Enter the number of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the elements: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched");
		s=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==s) {
				System.out.println("The number has been found");
				c++;
			}
				
		}
		if(c<1)
		{
			System.out.println("Number not found");
		}
		// TODO Auto-generated method stub

	}

}
