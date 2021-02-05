import java.io.*;
import java.util.Scanner;
class MatrixMulti
{
public static void main(String args[])throws IOException
{
	int r1,r2,c1,c2;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number of rows and columns of MATRIX 1 :");
	r1=scan.nextInt();
	c1=scan.nextInt();
	System.out.println("Enter the number of rows and columns of MATRIX 2 :");
	r2=scan.nextInt();
	c2=scan.nextInt();
	if(c1==r2)
	{
		int mat1[][]=new int [r1][c1];
		int mat2[][]=new int [r2][c2];
		int p[][]=new int [r1][c2];
		System.out.println("Enter MATRIX 1:");
		for(int i=0;i<r1;++i)
			for(int j=0;j<c1;++j)
				mat1[i][j]=scan.nextInt();
				
		System.out.println("Enter MATRIX 2:");
		for(int i=0;i<r2;++i)
			for(int j=0;j<c2;++j)
				mat2[i][j]=scan.nextInt();
				
		System.out.print("\n\n\nProduct Matrix:\n");
		for(int i=0;i<r1;++i)
			for(int j=0;j<c2;++j)
			{
			p[i][j]=0;
				for(int k=0;k<c1;++k)
				p[i][j]+=mat1[i][k]*mat2[k][j];		
					
			}			
		for(int i=0;i<r1;++i)
		{
			for(int j=0;j<c2;++j)
				System.out.print(p[i][j]+"\t");
			System.out.println();
		}
	}
	else
	{
		System.out.println("Matrix multiplication not possible");
	}	
}
}
