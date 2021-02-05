
import java.util.*;
class Queue
{
	private final int SIZE = 20;
	private int[] queArray;
	private int front;
	private int rear;
	public Queue() // constructor
	{
		queArray = new int[SIZE];
		front = 0;
		rear = -1;
	}
	public void insert(int j)
	{
		if(rear == SIZE-1)
			rear = -1;
		queArray[++rear] = j;
	}
	public int remove()
	{
		int temp = queArray[front++];
		if(front == SIZE)
			front = 0;
		return temp;
	}
	public boolean isEmpty() 
	{
		return ( rear+1==front || (front+SIZE-1==rear) );
	}
}
//****************************************************************************
class Vertex
{
	public char label;
	public boolean wasVisited;
	public Vertex(char lab) // constructor
	{
		label = lab;
		wasVisited = false;
	}
}
//****************************************************************************
class Graph
{
	private final int MAX_VERTS = 20;
	private Vertex vertexList[]; 
	private int adjMat[][];
	private int nVerts;
	private Queue theQueue;
	public Graph() // constructor
	{
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for(int j=0; j<MAX_VERTS; j++) 
			for(int k=0; k<MAX_VERTS; k++)
				adjMat[j][k] = 0;
		theQueue = new Queue();
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
	public void bfs()
	{
		vertexList[0].wasVisited = true; 
		displayVertex(0);
		theQueue.insert(0); 
		int v2;
		while( !theQueue.isEmpty() ) 
		{
			int v1 = theQueue.remove();
			while( (v2=getAdjUnvisitedVertex(v1)) != -1 )
			{
				vertexList[v2].wasVisited = true;
				displayVertex(v2); // display it
				theQueue.insert(v2); // insert it
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
//***********************************************************
class BreadthFirstSearch
{
	public static void main(String[] args)
	{
		Graph theGraph = new Graph();
		Scanner sc=new Scanner(System.in);
	
		System.out.println("1.Add Vertex: \n2.Add edge:  \n3.Breadth First Search: \n4.exit");
		
			
			int x;		   
		do
		{    
			System.out.println("Enter choice");
			x=sc.nextInt();	
			switch(x)
			{
				case 1:
						System.out.println("Enter the vertex to insert");
					    char v=sc.next().trim().charAt(0);
						theGraph.addVertex(v);
						break;
				case 2:
				        System.out.println("Enter the two vertices no. for adding edge between them");
						int s=sc.nextInt();
						int e=sc.nextInt();
						theGraph.addEdge(s,e);
						break;
				case 3:
						System.out.println("Visited");
						theGraph.bfs();
						System.out.println(" ");
						break;
				case 4:
					break;
				default:
					System.out.println("invalid choice");
			}
		}while(x!=4);
	}
}
/*
1.Add Vertex:
2.Add edge:
3.Breadth First Search:
4.exit
Enter choice
1
Enter the vertex to insert
A
Enter choice
1
Enter the vertex to insert
B
Enter choice
1
Enter the vertex to insert
C
Enter choice
1
Enter the vertex to insert
D
Enter choice
1
Enter the vertex to insert
E
Enter choice
2
Enter the two vertices no. for adding edge between them
0
1
Enter choice
2
Enter the two vertices no. for adding edge between them
1
2
Enter choice
2
Enter the two vertices no. for adding edge between them
0
3
Enter choice
2
Enter the two vertices no. for adding edge between them
3
4
Enter choice
3
Visited
ABDCE
Enter choice
4
*/