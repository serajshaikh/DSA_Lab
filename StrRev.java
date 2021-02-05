import java.io.*;
import java.util.Scanner;
class StrRev
{	
	private String input;
	private String output;
	
	public StrRev(String in)
	{
		input=in;
	}
	
	public String Rev()
	{
		Stack stkstr=new Stack(input.length());
		for(int i=0;i<input.length();++i)
			stkstr.push(input.charAt(i));
		output="";
		for(int i=0;i<input.length();++i)
			output=output+stkstr.pop();
		return output;
	}
	class Stack
	{
		private int MaxSize;
		private char[] stk;
		private int top;
	
		public Stack(int s)
		{
			MaxSize=s;
			stk=new char[MaxSize];
			top=-1;
		}
		public void push(char ch)
		{
			stk[++top]=ch;
		}
		public char pop()
		{
			return stk[top--];
		}
		public char peek()
		{
			return stk[top];
		}
	}
	public static void main(String args[])
	{
		String input;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the string: ");
		input=scan.nextLine();
		
		StrRev obj=new StrRev(input);
		System.out.println("Reversed String: "+obj.Rev());
	}
	
	
}
