package array;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int even=0,odd=0;
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
			if(arr[i]%2==0)
			{
				even++;
				
			}
			else
				odd++;
		}
		System.out.println("No of even numbers are :"+even+"\nNo of odd number are :"+odd);
		// TODO Auto-generated method stub

	}

}
