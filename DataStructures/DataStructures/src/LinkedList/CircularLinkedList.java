package LinkedList;

public class CircularLinkedList {
	
	public Node head;
	public Node current =head;
	private static int count =0;
	
	public void AddNode(int value)
	{
	
	if (count==0)
	 {
		Node n = new Node(value);
		head = n;
		current=head;	
		current.SetNext(head);
		count++;
	 }
	else
	{
		Node n= new Node(value);
		while(current.GetNext()!=head)
		{
			current =current.GetNext();
		}
		current.SetNext(n);
		n.SetNext(head);
	}
	}
	
	public void AddLast(int value)
	{
		//public Node prev;
		current=head;
		//prev=head;
		Node n= new Node(value);
		while(current.GetNext()!=head)
		{
			
		current=current.GetNext();
		}
		current.SetNext(n);
		n.SetNext(head);
		count++;
	}
	 
	public void AddinPosition(int value, int position)
	{
		current = head;
		if (count==0 ||position ==0 )
		{
			AddNode(value);
		}
		else if(position >count+1)
		{
			System.out.println("Error");
	
		}
		else if (position ==count+1)
		{
			AddLast(value);
		}
		else
		{
			Node n = new Node(value);
			for(int i =1; i< position-1;i++)
			{
				current = current.GetNext();
			}
			n.SetNext(current.GetNext());
			current.SetNext(n);
			count++;
		}
	}
     
	
	public void PrintElements()
	{
		Node Current = head;
		
		while(Current.GetNext()!=head)
		{
			System.out.print(Current.GetValue() + " -> ");
			Current=Current.GetNext();
		}
		System.out.print(Current.GetValue());
        System.out.println(" ");
        System.out.println("Count :" + count );
	}
	 
  }


