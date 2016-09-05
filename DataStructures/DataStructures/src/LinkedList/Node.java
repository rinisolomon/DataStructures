package LinkedList;

public class Node {
	
	private int value;
	private Node next;
	
	//constructor
	public Node()
	{
	
	}
	public Node(int value)
	{
		this.value = value;
		this.next = null;
	}
	
	public void SetNext(Node next)
	{
		this.next = next;
	}
	
	public Node GetNext()
	{
		return this.next;
	}
	
	public int GetValue()
	{
		return this.value;
	}
	
	
	
	
	
}



