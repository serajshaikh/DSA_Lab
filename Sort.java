
import java.io.*;
import java.util.Scanner;

class Sort

{
 public static void main(String args[])

 { 
int[] b=new int[10];
    
int n; 
  
Scanner in=new Scanner(System.in);
 
System.out.println("enter the elements number");

 n=in.nextInt();

System.out.println("enter the elements");

for(int i=0;i<n;i++)

{
b[i]=in.nextInt();
}

for(int i=0;i<n-1;i++)

{
 
 for(int j=0;j<n-i-1;j++)
{
 
if(b[j]>b[j+1])

{ 
int temp;
 
 temp=b[j];
  b[j]=b[j+1];
  b[j+1]=temp;
}
}
}

System.out.println("sorted array is");

for(int i=0;i<n;i++)

{
System.out.print(b[i]+"\t");
}
}
}


