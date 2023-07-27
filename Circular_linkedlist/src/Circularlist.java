

import java.util.Scanner;

public class Circularlist {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail=null;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail=new_node;
                new_node.next=head; // Point back to head to make it circular
            } else {
                System.out.println("Enter 1-To insert node at beginning. 2-at end 3-at specific position ");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        new_node.next = head;
                        head=new_node;
                        tail.next=head;
                        break;
                       
                       
                    case 2:
                        tail.next=new_node;
                        
                        tail=new_node;
                        new_node.next=head;
                        break;
                        
                    case 3:
                    	System.out.println("Enter position of node to be inserted");
    					int p = sc.nextInt();
    					Node temp1 = head;
    					for (int i = 0; i< (p - 2); i++) {
    						temp1 = temp1.next;

    					}
    					new_node.next = temp1.next;
    					temp1.next = new_node;
    					break;
                }
            }
            System.out.println("Do you want to add more data? If yes, press 1");
            n = sc.nextInt();
        } while (n == 1);
    }

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
                        tail.next=head;
                        
                        break;
                    case 2:
                        Node temp2 = head;
                        Node ptr2 = temp2.next;
                        while (ptr2.next != head) {
                            temp2=ptr2;
                            ptr2=ptr2.next;
                        }
                        temp2.next=head;
                        tail=temp2;
                        break;
                    case 3:
                    	System.out.println("enter position of node to be deleted");
    					p = sc.nextInt();
    					Node temp3 = head;
    					Node ptr3 = temp3.next;
    					for (int i = 0; i< (p - 2); i++) {
    						temp3 = ptr3;
    						ptr3 = ptr3.next;
    					}
    					temp3.next = ptr3.next;
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
            } while (temp != head);
        }
    }

    public static void main(String args[]) {
        Circularlist list = new Circularlist();
        list.creation();
        list.delete();
        list.traverse();
    }
}


