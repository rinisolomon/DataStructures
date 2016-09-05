package LinkedList;

public class DoubleNode 
{
	private int value;
	private DoubleNode next;
	private DoubleNode prev;

	public DoubleNode(int value)
	{
		this.value=value;
	}
	
	public int Getvalue()
	{
		return this.value;
	}
	
	public void SetDoubleNodePointer(DoubleNode next,DoubleNode prev)
	{
		this.next = next;
		this.prev = prev;
	}
	
	public void SetDoubleNext(DoubleNode next)
	{
		this.next = next;
		
	}
	public void SetDoublePrev(DoubleNode prev)
	{
		this.prev = prev; 
		
	}
	public DoubleNode GetDoubleNext()
	{
		return this.next;
	}
	
	public DoubleNode GetDoublePrev()
	{
		return this.prev;
	}
	
	
	
}
