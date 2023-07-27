

	import java.util.Scanner;

	public class Stack {
		int top = -1;
		int n=10;
		int a[] =new int[n];
		void push(Scanner sc)
		{
			if(top==(n-1))
			{
				System.out.println("Overflow");
			}
			else
			{
				System.out.println("enter data");
				int i=sc.nextInt();
				top=top+1;
				a[top]=i;
				System.out.println("item inserted");
			}
		}
		void pop()
		{
			if(top==-1)
			{
				System.out.println("underflow");
				
			}
			else 
			{
				top=top-1;
				System.out.println("item deleted");
			}
		}
		void display()
		{
			System.out.println("items are:");
			for(int j=top; j>=0; j--)
			{
				System.out.println(a[j]);
			}
		}
		
		public static class stack_array
		{
			public static void main(String[] args) {
				int d;
				Scanner sc = new Scanner (System.in);
				Stack s= new Stack();
				int l;
			do
			{
				System.out.println("press 1 to push");
				System.out.println("press 2  to pop");
				System.out.println("press 3 to display");
				System.out.println("enter your choice");
				d=sc.nextInt();
				switch(d)
				{
				case 1:
				{
					s.push(sc);
					break;
				}
				case 2:
				{
					s.pop();
					break;
				}
				case 3:
				{
					s.display();
					break;
					
				}
				}
				System.out.println("enter 0 to go back to main menu");
				System.out.println("enter any key to exit");
				l=sc.nextInt();
				
				}
			while (l==0);
			System.out.println("exit sucessfully");
			
			
			}
		}

	}





