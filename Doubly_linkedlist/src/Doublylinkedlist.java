import java.util.Scanner;



public class Doublylinkedlist {
static class Node 
{
	int data;
	Node next;
	Node prev;
	
	Node(int data)
	{
	 this.data=data;
	 this.next=null;
	 this.prev=null;
	}
}
 Node head=null;
 Node tail=null;
 

public void creation() 
{ int data,n,m,p;
 Scanner sc=new Scanner(System.in);
 do
 {System.out.println("Enter data");
 data=sc.nextInt();
 Node new_node=new Node(data);
 if(head==null)
 {
	 head=new_node;
	 tail=new_node;
 }
 else
 { System.out.println("Enter 1. to insert at beginning 2-at end  3.-at position");
   m=sc.nextInt();
   switch(m) 
   { case 1:
	   new_node.next=head;
	   head.prev=new_node;
	   head=new_node;
	   break;
   case 2:
	   tail.next=new_node;
	   new_node.prev=tail;
	   tail=new_node;
	   break;
   case 3:
	   System.out.println("Enter position of node to be inserted");
	   p=sc.nextInt();
	   Node temp1=head;
	   Node ptr=temp1.next;
	   for(int i=1;i<(p-1);i++) 
	   {
		   temp1=ptr;
		   ptr=ptr.next;
	   }
     new_node.prev=temp1;
     new_node.next=ptr;
     temp1.next=new_node;
     ptr.prev=new_node;
     break;
   } 
	 
 } System.out.println("do u want to add more if yes press 1");
   n=sc.nextInt();
 }while(n==1);
}	
  //////////////////////////////////////////
public void delete() {
    int n, m, p;
    Scanner sc = new Scanner(System.in);
    do {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            System.out.println("Enter 1-delete from beginning 2-delete from end 3-delete from specific position");
            m = sc.nextInt();
            switch (m) {
                case 1:
                    Node temp=head;
                    temp=temp.next;
                    head=temp;
                    head.prev=null;
                    
                    break;
                case 2:
                    Node temp1=tail;
                    temp1=temp1.prev;
                    temp1.next=null;
                    break;
                   
                    
                case 3:
                	System.out.println("enter position of node to be deleted");
					p = sc.nextInt();
					Node temp3 = head;
					Node ptr3 = temp3.next;
					for (int i = 1; i< (p-1); i++) {
						temp3 = ptr3;
						ptr3 = ptr3.next;
					}
					temp3.next = ptr3.next;
					ptr3.next.prev=temp3;
					break;
            }
        }
        System.out.println("Do you want to delete more data? If yes, press 1");
        n = sc.nextInt();
    } while (n == 1);
}
public void traverse() {
  if (head == null) {
      System.out.println("Linked list does not exist");
  } else {
      Node temp = head;
      do {
          System.out.println(temp.data);
          temp = temp.next;
      } while (temp != null);
  }
}
   public static void main(String args[]) {
       Doublylinkedlist list = new Doublylinkedlist();
       list.creation();
       list.delete();
       list.traverse();
   }

}

