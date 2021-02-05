import java.io.*;
import java.util.Scanner;
class BinarySearch
 { 
   
    int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) 
{ 
            int m = l + (r - l) / 2; 
            if (arr[m] == x) 
                return m; 
  
            
            if (arr[m] < x) 
                l = m + 1; 
  
            
            else
                r = m - 1; 
        } 
  
      
        return -1; 
    } 
  
  
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
	int arr[]=new int[10];
	int i,n,ele;

	System.out.println("Enter the size");
	Scanner ob1=new Scanner(System.in);
	n=ob1.nextInt();
	System.out.println("Enter the elements");
	for( i=0;i<n;i++)
	{
	arr[i]=ob1.nextInt();
	}
	System.out.println("Enter the element to be searched");
	ele=ob1.nextInt();
        
        int result = ob.binarySearch(arr, ele); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                               + "index " + (result+1)); 
    } 
} 
