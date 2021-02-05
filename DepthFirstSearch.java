/*  
    NAME :SERAJ AHAMAD
    CLASS:CS 'B' 
    SEM -4th
    ROLL:84
    PROGRAM: Depth First Search
*/
import java.util.*;
class StackX
{
	private final int SIZE = 20;
	private int[] st;
	private int top;
	public StackX()
	{
		st = new int[SIZE];
		top = -1;
	}
	public void push(int j)
	{
		st[++top] = j;
	}
	public int pop()
	{
		return st[top--];
	}
	public int peek()
	{
		return st[top];
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
}
//*******************************************************************
class Vertex
{
	public char label;
	public boolean wasVisited;
	public Vertex(char lab)
	{
		label = lab;
		wasVisited = false;
	}
}
//******************************************************************
class Graph
{
	private final int MAX_VERTS = 20;
	private Vertex vertexList[];
	private int adjMat[][]; 
	private int nVerts;
	private StackX theStack;
	public Graph() // constructor
	{
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for(int j=0; j<MAX_VERTS; j++)
		for(int k=0; k<MAX_VERTS; k++)
		adjMat[j][k] = 0;
		theStack = new StackX();
	}
	public void addVertex(char lab)
	{
		vertexList[nVerts++] = new Vertex(lab);
	}
	public void addEdge(int start, int end)
	{
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].label);
	}
	public void depthFirst() 
	{ 
		vertexList[0].wasVisited = true;
		displayVertex(0); 
		theStack.push(0); 
		while(!theStack.isEmpty() )
		{
			int v = getAdjUnvisitedVertex( theStack.peek() );
			if(v == -1)theStack.pop();
			else 
			{
				vertexList[v].wasVisited = true;
				displayVertex(v); 
				theStack.push(v);
			}
		}
		for(int j=0; j<nVerts; j++) 
		vertexList[j].wasVisited = false;
	} 
	public int getAdjUnvisitedVertex(int v)
	{
		for(int j=0; j<nVerts; j++)
			if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
				return j;
			return -1;
	} 
}
//****************************************************************************
class DepthFirstSearch
{
	public static void main(String[] args)
	{
		Graph theGraph = new Graph();
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("1.Add Vertex: ");
		System.out.println("2.Add edge: ");
		System.out.println("3.Depth First Search: ");
		System.out.println("4.exit: ");
		int x;
	   do
		{
			System.out.println("Enter the choice");
			x=scan.nextInt();
			switch(x)
			{
				case 1:
					System.out.println("Enter the vertex to insert");
					char v=scan.next().trim().charAt(0);
					theGraph.addVertex(v);
					break;
				case 2:
					System.out.println("Enter the two vertices no. for adding edge between them");
					int s=scan.nextInt();
					int e=scan.nextInt();
					theGraph.addEdge(s,e);
					break;
				case 3:
					System.out.println("Visited: ");
					theGraph.depthFirst();
					System.out.println(" ");
					break;
				case 4:
					break;
				default:
					System.out.println("Invalid choice!!!");
			}
		}
		while(x!=4);
	}
}
/*OUTPUT
1.Add Vertex:
2.Add edge:
3.Depth First Search:
4.exit:
Enter the choice
1
Enter the vertex to insert
A
Enter the choice
1
Enter the vertex to insert
B

Enter the choice
1
Enter the vertex to insert
C

Enter the choice
1
Enter the vertex to insert
D

Enter the choice
1
Enter the vertex to insert
E

Enter the choice
2
Enter the two vertices no. for adding edge between them
0
1

Enter the choice
2
Enter the two vertices no. for adding edge between them
0
2

Enter the choice
2
Enter the two vertices no. for adding edge between them
1
3

Enter the choice
2
Enter the two vertices no. for adding edge between them
2
4

Enter the choice
3
Visited:
ABDCE

*/