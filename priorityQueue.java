// Implementing Priority Queue
import java.util.Scanner;
class priorityQueue
{
	static class Link
	{
		int data;
		int pr;
		Link next;
		public Link(int d,int p)
		{
			data=d;
			pr=p;
			next=null;
		}
		public void displayLink()
		{
			System.out.print(data+" ");
		}
	}
	static class linkList
	{
		Link first;
		public linkList()
		{
			first=null;
		}
		public void insertElement(int d,int p)
		{
			Link current=first;
			Link newLink=new Link(d,p);
			if(first==null)
				first=newLink;
			else if(newLink.pr<current.pr)
			{
				newLink.next=first;
				first=newLink;
			}	
			else
			{
				
				while(current!=null)
				{
					if(current.next==null)
					{
						current.next=newLink;
						break;	
					}
					else if(newLink.pr<current.next.pr)
					{
						newLink.next=current.next;
						current.next=newLink;
						break;
					}
					current=current.next;
				}
			}
		}
		public void deleteElement()
		{
			if(first==null)
				System.out.println("Empty Queue!!!");
			else
				first=first.next;
		}
		public void displayElements()
		{
			Link current=first;
			if(first==null)
				System.out.println("Empty Queue!!!");
			else
				while(current!=null)
				{
					current.displayLink();
					current=current.next;
				}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int c=0,d,p;
		linkList pQueue=new linkList();
		Scanner scan=new Scanner(System.in);
		while(c!=4)
		{	
			System.out.println("Enter your choice(1-4):");
			System.out.println("1.Insert A New Value: ");
			System.out.println("2.Delete A Element:");
			System.out.println("3.Display The Queue");
			System.out.println("4.Exit");
			c=scan.nextInt();
			switch(c)
			{
				case 1:
					System.out.println("Enter The Data And Its Priority: ");
					d=scan.nextInt();
					p=scan.nextInt();
					pQueue.insertElement(d,p);
					break;
				case 2:
					pQueue.deleteElement();
					break;
				case 3:
					pQueue.displayElements();
					break;
				case 4:
					break;
				default:
					System.out.println("Error!!!");
					break;
			}
		}
	}
}

/*output:

Enter your choice(1-4):
1.Insert A New Value:
2.Delete A Element:
3.Display The Queue
4.Exit
1
Enter The Data And Its Priority:
10
8
Enter your choice(1-4):
1.Insert A New Value:
2.Delete A Element:
3.Display The Queue
4.Exit
1
Enter The Data And Its Priority:
20
7
Enter your choice(1-4):
1.Insert A New Value:
2.Delete A Element:
3.Display The Queue
4.Exit
1
Enter The Data And Its Priority:
30
6
Enter your choice(1-4):
1.Insert A New Value:
2.Delete A Element:
3.Display The Queue
4.Exit
1
Enter The Data And Its Priority:
40
5
Enter your choice(1-4):
1.Insert A New Value:
2.Delete A Element:
3.Display The Queue
4.Exit
1
Enter The Data And Its Priority:
50
4
Enter your choice(1-4):
1.Insert A New Value:
2.Delete A Element:
3.Display The Queue
4.Exit
1
Enter The Data And Its Priority:
60
2
Enter your choice(1-4):
1.Insert A New Value:
2.Delete A Element:
3.Display The Queue
4.Exit
3
60 50 40 30 20 10
Enter your choice(1-4):
1.Insert A New Value:
2.Delete A Element:
3.Display The Queue
4.Exit
2
Enter your choice(1-4):
1.Insert A New Value:
2.Delete A Element:
3.Display The Queue
4.Exit
3
50 40 30 20 10
Enter your choice(1-4):
1.Insert A New Value:
2.Delete A Element:
3.Display The Queue
4.Exit

*/

