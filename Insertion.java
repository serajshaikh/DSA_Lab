import java.io.*;
import java.util.Scanner;
class Insertion
{
public static void main(String args[]) throws IOException
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
for(i=1;i<n;i++)
{
int key=a[i];
j=i-1;
while(j>=0&&key<=a[j])
{
a[j+1]=a[j];
j-=1;
}
a[j+1]=key;
}
System.out.println("The sorted array is");
for(i=0;i<n;i++)
{
System.out.print(a[i]+"\t");
}
}
}
