/*
NAME SERAJ AHAMAD
ROLL NO 84
CLASS CS(B)
*/
import java.util.*;
class Link
{
public int iData; 
public double dData; 
public Link next; 
// -------------------------------------------------------------
public Link(int id) 
{
iData = id;
} 
// -------------------------------------------------------------
public void displayLink()
{
System.out.print(iData);
System.out.print(" ");
}
} 
////////////////////////////////////////////////////////////////
class LinkList
{
private Link first; 
// -------------------------------------------------------------
public LinkList() 
{
first = null; 
}
// -------------------------------------------------------------
public boolean isEmpty() 
{
return (first==null);
}
// -------------------------------------------------------------

public void insertFirst(int id)
{ 
Link newLink = new Link(id);
newLink.next = first; 
first = newLink; 
}
//--------------------------------------------------------------
public void insertLast(int id)
{
Link newLink=new Link(id);
Link current=first;
while(current.next!=null)
{
current=current.next;
}

current.next=newLink;
newLink.next=null;

}
//--------------------------------------------------------------


public void insertPosition(int pos,int id)
{
Link newLink=new Link(id);
Link current=first;
Link pre=first;
for(int i=1;current!=null&&i<pos;i++)
{
pre=current;
current=current.next;
}
if(current==null)
{
   current.next=newLink;
   newLink.next=null;
}

pre.next=newLink;
newLink.next=current;

}
// -------------------------------------------------------------
public Link deleteFirst() 
{ 
Link temp = first; 
first = first.next; 
return temp; 
}
//--------------------------------------------------------------
public Link deleteLast()
{
Link current=first;
Link pre=first;
while(current.next!=null)
{
  pre=current;
  current=current.next;
}

if(current==first)
first=null;
else
{
pre.next=null;

}
return current;
}
//--------------------------------------------------------------

public Link deletePosition(int pos)
{

if(first==null)
return first;
Link temp=first;
Link pre=first;
if(pos==1)
{
 first=first.next;
 return temp;
}

for(int i=1; temp!=null&&i<pos;i++)
{
pre=temp;
temp=temp.next;
}

if(temp==null||temp.next==null)
{
pre.next=null;
return temp;
}
pre.next=temp.next;
return temp;
}
// -------------------------------------------------------------
public void displayList()
{
System.out.print("List (first-->last): ");
Link current = first; 
while(current != null) 
{
current.displayLink(); 
current = current.next; 
}
System.out.println("");
}
// -------------------------------------------------------------
} 
////////////////////////////////////////////////////////////////
class LinkListApp
{
public static void main(String[] args)
{
		int c=0,e,p;
		LinkList theList = new LinkList();
		Scanner scan=new Scanner(System.in);
		while(c!=8)
		{        System.out.println("");
			System.out.println("Enter your choice(1-8)");
			System.out.println("1.Insert First");
                        System.out.println("2.Insert Last");
      			System.out.println("3.Insert at any Given position");
			System.out.println("4.Delete First");
			System.out.println("5.Delete at Last");
			System.out.println("6.Delete position");
			System.out.println("7.Display List");
			System.out.println("8.Exit");
			c=scan.nextInt();
			switch(c)
			{
				case 1:
					System.out.println("Enter element to be inserted");
					e=scan.nextInt();
					theList.insertFirst(e); 
					break;
                case 2:
                       System.out.println("Enter Element to be Inserted at last ");
                       e=scan.nextInt();
 				       theList.insertLast(e);
                                       break;

				case 3:
				    System.out.println("Enter position and element Value");
                    p=scan.nextInt();
					e=scan.nextInt();
 				       theList.insertPosition(p,e);
					theList.displayList(); 
                                       break;

				case 4:
                                         {
                                                Link aLink = theList.deleteFirst(); 
                                                System.out.print("Deleted "); 
                                                aLink.displayLink();
                                                System.out.println("");
                                          }
                                                theList.displayList(); 
                                         
					break;
				case 5:
					{
					
					Link aLink=theList.deleteLast();
					System.out.print("Deleted ");                       
					aLink.displayLink(); 			
					System.out.println(" ");
					}
					 theList.displayList();
                                case 6:
					{
					e=scan.nextInt();
					 Link aLink=theList.deletePosition(e);
					 System.out.print("Deleted ");
					aLink.displayLink();			
					System.out.println(" ");
					}
				case 7:
					theList.displayList(); 
					break;
				case 8:
					break;
				default:
					System.out.println("Wrong choice!!!");
			}
			
		}
		
	}
}
//////////////////////////////////////////////////////////////////////
/*
OUTPUT
Enter your choice(1-8)
1.Insert First
2.Insert Last
3.Insert at any Given position
4.Delete First
5.Delete at Last
6.Delete position
7.Display List
8.Exit
1
Enter element to be inserted
25

Enter your choice(1-8)
1.Insert First
2.Insert Last
3.Insert at any Given position
4.Delete First
5.Delete at Last
6.Delete position
7.Display List
8.Exit
1
Enter element to be inserted
26

Enter your choice(1-8)
1.Insert First
2.Insert Last
3.Insert at any Given position
4.Delete First
5.Delete at Last
6.Delete position
7.Display List
8.Exit
2
Enter Element to be Inserted at last 
100

Enter your choice(1-8)
1.Insert First
2.Insert Last
3.Insert at any Given position
4.Delete First
5.Delete at Last
6.Delete position
7.Display List
8.Exit
7
List (first-->last): 26 25 100 

Enter your choice(1-8)
1.Insert First
2.Insert Last
3.Insert at any Given position
4.Delete First
5.Delete at Last
6.Delete position
7.Display List
8.Exit
2
Enter Element to be Inserted at last 
100

Enter your choice(1-8)
1.Insert First
2.Insert Last
3.Insert at any Given position
4.Delete First
5.Delete at Last
6.Delete position
7.Display List
8.Exit
7
List (first-->last): 26 25 100 100 

Enter your choice(1-8)
1.Insert First
2.Insert Last
3.Insert at any Given position
4.Delete First
5.Delete at Last
6.Delete position
7.Display List
8.Exit
3
Enter position and element Value
4
20
List (first-->last): 26 25 100 20 100 

Enter your choice(1-8)
1.Insert First
2.Insert Last
3.Insert at any Given position
4.Delete First
5.Delete at Last
6.Delete position
7.Display List
8.Exit
6
3
Deleted 100  
List (first-->last): 26 25 20 100 

Enter your choice(1-8)
1.Insert First
2.Insert Last
3.Insert at any Given position
4.Delete First
5.Delete at Last
6.Delete position
7.Display List
8.Exit
4
Deleted 26 
List (first-->last): 25 20 100 

Enter your choice(1-8)
1.Insert First
2.Insert Last
3.Insert at any Given position
4.Delete First
5.Delete at Last
6.Delete position
7.Display List
8.Exit
5
Deleted 100  
List (first-->last): 25 20 
*/

