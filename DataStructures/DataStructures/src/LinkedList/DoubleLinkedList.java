package LinkedList;
import java.util.Scanner;

public class DoubleLinkedList
{
	private static int count=0;
	public DoubleNode Head;
	public DoubleNode Tail;
	public DoubleNode Current;
	
	
	public void AddFirst(int value)
	{
		DoubleNode newnode = new DoubleNode(value);
		if (count==0)
		{
			Head = newnode ;
			Tail = newnode;
			
			Head.SetDoubleNodePointer(null, null);
			Tail.SetDoubleNodePointer(null, null);
			count++;
		}
		else
		{
			Current=Head;
			Head=newnode;
			Head.SetDoublePrev(null);
			Head.SetDoubleNext(Current);
			Current.SetDoublePrev(Head);
			count++;
		}
		
	}
	
	public void AddLast(int value)
	{
		DoubleNode newnode = new DoubleNode(value);
		Current = Head;
		for(int i=1;i<count;i++)
		{
			Current = Current.GetDoubleNext();
				
		}
		 newnode.SetDoublePrev(Current);
		 Current.SetDoubleNext(newnode);
		 newnode.SetDoubleNext(null);
		 Tail=newnode;
		 count++;
		
	}
	
	public void AddNode(int value, int position)
	{
		if ( position==1)
		{
			AddFirst(value);
		}
		else if (position==count+1)
		{
			AddLast(value);
		}
				
		else if(position > count+1 ||position ==0)
		{
			System.out.println("Position not valid");
		}
		else 
		{
			DoubleNode newnode = new DoubleNode(value);
			DoubleNode previous;
			Current = Head;
			previous = Head;
			for (int i=1;i<position;i++)
			{
				previous=Current;
				Current = Current.GetDoubleNext();
			}
			
			newnode.SetDoubleNext(Current);
			newnode.SetDoublePrev(previous);
			Current.SetDoublePrev(newnode);
			previous.SetDoubleNext(newnode);
			
			count++;
		}
	}
	
	
	
	public void PrintElements()
	{
		System.out.println("Count  " + count);
		Current =Head;
		while(Current!=null)
		{
			System.out.print(Current.Getvalue() + " <-> ");
			Current = Current.GetDoubleNext();
		}
		System.out.println("null");
		System.out.println("Count  " + count);
		
	}
	

}
