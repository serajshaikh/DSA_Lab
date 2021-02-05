import java.io.*;
import java.util.Scanner;
class Linear
{
public static void main(String args[])
{
int a[]=new int[10];
int n,ele,i,flag=0;
System.out.println("Enter the size");
Scanner ob=new Scanner(System.in);
n=ob.nextInt();
System.out.println("Enter the elements");
for( i=0;i<n;i++)
{
a[i]=ob.nextInt();
}
System.out.println("Enter the element to be searched");
ele=ob.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==ele)
{
flag=1;
break;
}
else
{
flag=0;
}
}
if(flag==1)
{
System.out.println("Element found at position "+(i+1));
}
else
{
System.out.println("Element not found");
}
}
}


