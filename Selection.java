import java.io.*;
import java.util.Scanner;
class Selection
{
public static void main(String args[])
{
int a[]=new int[10];
int n,i,j,min;
System.out.println("Enter the size");
Scanner ob=new Scanner(System.in);
n=ob.nextInt();
System.out.println("Enter the elements to be sorted");
for( i=0;i<n;i++)
{
a[i]=ob.nextInt();
}
for(i=0;i<n-1;i++)
{
min=i;
for(j=i+1;j<n;j++)
{
if(a[j]<a[min])
{
min=j;
}
}
int temp;
temp=a[min];
a[min]=a[i];
a[i]=temp;
}
System.out.println("The sorted array is");
for(i=0;i<n;i++)
{
System.out.print(a[i]+"\t");
}
}
}

