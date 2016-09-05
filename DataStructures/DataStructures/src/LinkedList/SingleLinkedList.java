package LinkedList;

import java.util.Scanner;

public class SingleLinkedList 
{
	
	public Node Head;
	public Node Tail;
	private static int count =0;
	
	public void AddNode(int value)
	{
		if (count==0)
		{
			Node n = new Node(value);
			Head = n;
			Tail = n;			
		}
		else
		{
			Node newnode =  new Node(value);
			Tail.SetNext(newnode) ;
			Tail = newnode;
		}	
		count++;
	}
	
	public void AddNodeFirst(int value)
	{
		Node n = new Node(value);
		if (count == 0)
		{
			Head = n;
			Tail = n;
		}
		else
		{
			n.SetNext(Head);
			Head = n ;
		}
		count++;
	}
	
	
	public void AddNodeLast(int value)
	{
		Node newnode = new Node(value);
		if (count==0)
		{
			
			Head = newnode ;
			Tail = newnode ;
			count++;
		}
		else
		{
			Tail.SetNext(newnode);;
			Tail = newnode ;
			count++;
		}
	}
	
	
	public void AddNode(int value , int position)
	{
		if ((position) >(count+1))     // if given position is out of bounds
		
		{
			throw new IllegalArgumentException("item out of bounds");
		}
		else
		{
			if ((position) == (count+1))  // inserting a node in the last
			{
				AddNodeLast( value);
			}
			else if ((position) == 1)  // inserting a node in the beginning
			{
				AddNodeFirst(value);
			}
			else
			{
				Node Current = Head;       
				for(int i=1;i<(position-1);i++)                 // loop till position is 1 less than count , so that current.getNext() will point to the node in t he given position.
				{
					Current = Current.GetNext();
				}
				
				Node newnode = new Node(value);         // creating a new node with the given value
				newnode.SetNext(Current.GetNext());     // set the node which the current node points to to what newnode should point to
				Current.SetNext(newnode);    
				count++;
				                          //set the current node's next pointer to point to new node.
				
			}
		}
	}
	
	
	public void RemoveNode()
	{
		System.out.println("Enter the position of node to remove ");
		Scanner r = new Scanner(System.in);
		int pos= r.nextInt();
		Node Next;
		Node Current =Head;
		if (pos==1)
		{
			Head =Head.GetNext();
			count--;
		}
		else if(pos ==count)
		{
			for (int i =1;i<pos-1;i++)
			{
				Current =Current.GetNext();
			}
			Tail=Current;
			Tail.SetNext(null);
			count--;
			
		}
		else if (pos == 0 || pos>count)
		{
			throw new IllegalArgumentException("wrong position entered");
		}
		else
		{
			for (int i =1;i<pos-1;i++)
			{
				Current =Current.GetNext();
			}
			Next =Current.GetNext();
			Current.SetNext(Next.GetNext());
			count--;
		}
			
	}
	
	
	
	public void PrintElements()
	{
		Node Current = Head;
		while(Current!=null)
		{
			System.out.print(Current.GetValue() + " -> ");
			Current=Current.GetNext();
		}
		System.out.print("null");
        System.out.println(" ");
        System.out.println("Count :" + count );
	}
 
 
}
