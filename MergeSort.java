
import java.io.*;

import java.util.*;


class MergeSort
{
	
	
public static void main(String args[]) throws IOException
{
	
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
int l, Arr[];
		
System.out.println("Enter the size of the array");
		
l= Integer.parseInt(br.readLine());
               
 Arr = new int[l];	
		
System.out.println("Enter the elements of the array");
		
for(int i = 0; i < l; i++) 
		  
		 
 {    
		 	
Arr [i]=Integer.parseInt(br.readLine());
		  
}

		
		
MergeSort m = new MergeSort();
		
m.sort(Arr,0,l-1);
		
		
System.out.println("Sorted array is");
		
for(int i=0; i<l; i++)
			
System.out.println(Arr[i] + " ");
		
System.out.println();
	
}

	
void sort(int arr[], int l, int r)
{
		 	
if(l<r)
{
			
int m = (l+r)/2;
			
sort(arr, l, m);
			
sort(arr, m+1, r);
			
mergeEm(arr, l,m,r);
		
}
	
}
		


	
	
void mergeEm(int arr[], int l, int m, int r)
{
		
int p = m-l+1;
		
int q = r-m;
		
int L[] = new int[p];
		
int R[] = new int[q];
		
		
for(int i=0; i<p; i++)
			
L[i] = arr[l + i];
		
for(int i=0; i<q; i++)
			
R[i] = arr[m+1+i];
		
int a[] = merge(L,R);

		
for(int i = l,j=0; i<=r; i++,j++)
			
arr[i] = a[j];
	}


	
int[]  merge(int[] a, int[] b)
{
		
int res[] = new int[a.length + b.length];
		
int i=0,j=0;
		
int k =0;
		
while(i<a.length && j<b.length)
{
			
if(a[i]<b[j])
{		
				
res[k++] = a[i++];
			
}
			
else
{
				
res[k++] = b[j++];
			
}
		
}
		
while(j<b.length)
{
			
res[k++] = b[j++];
		
}
		
while(i<a.length)
{
			
res[k++] = a[i++];
		
}
		
return res;	
	
}

	

}
