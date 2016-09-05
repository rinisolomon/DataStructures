package LinkedList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) 
	{
		SingleLinkedList s = new SingleLinkedList();
        for (int i=0;i<5;i++)
        {
        	System.out.println("enter value");
        	Scanner r = new Scanner(System.in);
        	s.AddNode(r.nextInt());
		
        }
        
        s.PrintElements();
        
        
		
	}

}
