import java.io.*;
import java.util.Scanner;
class sum
{
	public static void main(String args[])throws IOException
	{
		int a,b,s;
		Scanner scan=new Scanner(System.in);	
		System.out.print("Enter the first number : ");
		a=scan.nextInt();
		System.out.print("Enter the second number : ");
		b=scan.nextInt();
		s=a+b;
		System.out.println("Sum = "+s);
	}
}
