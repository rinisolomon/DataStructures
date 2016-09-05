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
	
	public void PrintElements()
	{
		Node Current = Head;
		while(Current!=null)
		{
			System.out.println(Current.GetValue());
			Current=Current.GetNext();
		}
	}
 
 
}
