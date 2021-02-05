import java.io.*;
import java.util.Scanner;
class Bubble
{
	public static void main(String args[])
	{
		int arr[],size;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		size=scan.nextInt();
		arr=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;++i)
			arr[i]=scan.nextInt();
		for(int i=0;i<size;++i)
		{
			for(int j=0;j<size-i-1;++j)
			{
				if(arr[j]>arr[j+1])
				{
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}	
		}
		System.out.println("Sorted array: ");
		for(int i=0;i<size;++i)
			System.out.println(arr[i]);
	}
}
