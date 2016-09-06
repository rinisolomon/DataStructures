package LinkedList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) 
	{
		SingleLinkedList s = new SingleLinkedList();
		DoubleLinkedList d = new DoubleLinkedList();
		CircularLinkedList c = new CircularLinkedList();
        /*for (int i=0;i<5;i++)
        {
        	System.out.println("enter value");
        	Scanner r = new Scanner(System.in);
        	s.AddNode(r.nextInt());
		
        }
        s.PrintElements();
        */
        
   /*     //insert node in the beginning of the linked list
        System.out.println("enter value to insert in the beginning");
    	Scanner r = new Scanner(System.in);
        s.AddNodeFirst(r.nextInt());
        s.PrintElements(); */
        
        
     /*   //insert node at the end of the linked list
        System.out.println("enter value to insert in the end of the linked list");
    	Scanner r1 = new Scanner(System.in);
        s. AddNodeLast(r1.nextInt());
        s.PrintElements(); */
        
       int choice =1;
       /*
        do
        {
        System.out.println("Enter the position to enter");
        Scanner r2 = new Scanner(System.in);
        int pos = r2.nextInt();
        System.out.println("Enetr the value to insert");
        Scanner r3 = new Scanner(System.in);
        int val = r3.nextInt();
        
        s.AddNode(val,pos);
        s.PrintElements();
        
        System.out.println("Do you want to continue 0 -> Continue  1 -->Exit");
        Scanner r4 = new Scanner(System.in);
        choice = r4.nextInt();
        }while(choice == 0);     */

	  /* do
	   {
		   s.RemoveNode();
		   s.PrintElements();
		   System.out.println("Do you want to continue 0 -> Continue  1 -->Exit");
	       Scanner r4 = new Scanner(System.in);
	       choice = r4.nextInt();
	      
	    }while(choice == 0);  
	*/
	
	/*------------------DOUBLY LINKED LIST--------------------------*/
     /*  
       do
       {
    	      	   
    	   System.out.println("Enter the position to enter");
   	       Scanner r = new Scanner(System.in);
   	       int position = r.nextInt();
   		
   	       System.out.println("Enter the value to enter");
   	       Scanner r1 = new Scanner(System.in);
   	       int value = r1.nextInt();
   	       d.AddNode(value, position);
   	       
    	   d.PrintElements();
    	   System.out.println("enter 0 to exit");
	       Scanner r4 = new Scanner(System.in);
	      choice = r4.nextInt();
       }while (choice != 0);
	
	*/
       
       
     /*---------------------------------CIRCULAR LINKED LIST-------------------------*/
       
       do
       {
    	   
    	   System.out.println("Enter the position to enter");
   	       Scanner r = new Scanner(System.in);
   	       int position = r.nextInt();
   		
   	       System.out.println("Enter the value to enter");
   	       Scanner r1 = new Scanner(System.in);
   	       int value = r1.nextInt();
   	       //c.AddNode(value);
   	       
    	   c.AddinPosition(value, position);
    	   c.PrintElements();
    	   System.out.println("enter 0 to exit");
	       Scanner r4 = new Scanner(System.in);
	      choice = r4.nextInt();  
       }while(choice != 0);
       
	}

}
