//Circular Queue Using Linked List
import java.util.Scanner;
class circularQueue
{
	static class Link
	{
		Link next;
		int data;
		public Link(int d)
		{
			data=d;
			next=null;
		}
		public void displayLink()
		{
			System.out.print(data+" ");
		}
	}
	static class linkList
	{
		Link front;
		Link rear;
		public linkList()
		{
			front=null;
			rear=null;
		}
		public void insertLink(int d)
		{
			Link newLink=new Link(d);
			if(rear==null)
			{
				front=newLink;
				rear=newLink;
				newLink.next=newLink;
			}
			else
			{
				newLink.next=rear.next;
				rear.next=newLink;
				rear=newLink;
			}	
		}
		public void deleteLink()
		{
			if(front==null)
			{
				System.out.println("\n\nEmpty Queue!!!");
				System.out.println("\n\n");
			}
			else if(front==rear)
			{
				System.out.print("\n\nDeleted Element : ");
				front.displayLink();
				System.out.println("\n\n");
				front=null;
				rear=null;
			}
			else
			{
				System.out.print("\n\nDeleted Element : ");
				front.displayLink();
				System.out.println("\n\n");
				front=front.next;
				rear.next=front;
			}	
		}
		public void displayQueue()
		{
			Link beg=front;
			if(front==null)
				System.out.println("\n\nEmpty Queue!!!");
			else
			{
				System.out.print("\n\n\tQueue: ");
				do
				{
					beg.displayLink();
					beg=beg.next;
				}
				while(beg!=front);
			}
			System.out.println("\n");
		}	 
	}
	public static void main(String args[])
	{
		int c=0,e;
		linkList cqueue=new linkList();
		Scanner scan=new Scanner(System.in);
		while(c!=4)
		{
			System.out.println("Enter your choice(1-4)");
			System.out.println("1.Insert A New Node: ");
			System.out.println("2.Delete A Node From Queue: ");
			System.out.println("3.Display The Queue:");
			System.out.println("4.Exit");
			c=scan.nextInt();
			switch(c)
			{
				case 1:
					System.out.println("Enter Element To Be Inserted: ");
					e=scan.nextInt();
					cqueue.insertLink(e);
					break;
				case 2:
					cqueue.deleteLink();
					break;
				case 3:
					cqueue.displayQueue();
					break;
				case 4:
					break;
				default:
					System.out.println("Wrong Choice!!!");
			}
			
		}
		
	}
}


/*output: 

Enter your choice(1-4)
1.Insert A New Node:
2.Delete A Node From Queue:
3.Display The Queue:
4.Exit
1
Enter Element To Be Inserted:
10
Enter your choice(1-4)
1.Insert A New Node:
2.Delete A Node From Queue:
3.Display The Queue:
4.Exit
1
Enter Element To Be Inserted:
10
Enter your choice(1-4)
1.Insert A New Node:
2.Delete A Node From Queue:
3.Display The Queue:
4.Exit
1
Enter Element To Be Inserted:
20
Enter your choice(1-4)
1.Insert A New Node:
2.Delete A Node From Queue:
3.Display The Queue:
4.Exit
1
Enter Element To Be Inserted:
30
Enter your choice(1-4)
1.Insert A New Node:
2.Delete A Node From Queue:
3.Display The Queue:
4.Exit
1
Enter Element To Be Inserted:
40
Enter your choice(1-4)
1.Insert A New Node:
2.Delete A Node From Queue:
3.Display The Queue:
4.Exit
3


        Queue: 10 10 20 30 40

Enter your choice(1-4)
1.Insert A New Node:
2.Delete A Node From Queue:
3.Display The Queue:
4.Exit
2


Deleted Element : 10


Enter your choice(1-4)
1.Insert A New Node:
2.Delete A Node From Queue:
3.Display The Queue:
4.Exit
3


        Queue: 10 20 30 40

Enter your choice(1-4)
1.Insert A New Node:
2.Delete A Node From Queue:
3.Display The Queue:
4.Exit
2


Deleted Element : 10


Enter your choice(1-4)
1.Insert A New Node:
2.Delete A Node From Queue:
3.Display The Queue:
4.Exit
3


        Queue: 20 30 40

Enter your choice(1-4)
1.Insert A New Node:
2.Delete A Node From Queue:
3.Display The Queue:
4.Exit
*/
