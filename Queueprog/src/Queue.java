

	import java.util.Scanner;

	public class Queue {

		int f=-1,r=-1;
		int n=10;
		int q[]=new int [n];
		void enqueue(Scanner sc)
		{
			if(r==(n-1))
			{
				System.out.println("overflow condition");
			}
			else
			{
				System.out.println("enter data");
				int i=sc.nextInt();
				if(f==-1 && r==-1)
				{
					f=0;
					r=0;
					q[r]=i;
				}
				else
				{	
					r=r+1;
					q[r]=i; 
				}
			}
		}
		void dequeue()
		{
			if(f==-1 && r==-1)
			{
				System.out.println("underflow");
			}
			else {
				f=f+1;
			}
		}
		
		void display()
		{
			System.out.println("items are:");
			for(int i=f;i<=r;i++)
			{
				System.out.println(q[i]);
			}
		}
		
		public static void main(String[] args) {
			int d;
			Scanner sc=new Scanner(System.in);
			Queue s=new Queue();
			int l;
			do
			{
				System.out.println("Press 1 to enque");
				System.out.println("Press 2 to deenque");
				System.out.println("Press 3 to display");
				System.out.println("enter choice");
				d=sc.nextInt();
				switch(d)
				{
				case 1:
				{
					s.enqueue(sc);
					break;
				}
				case 2:
				{
					s.dequeue();
					break;
				}
				case 3:
				{
					s.display();
					break;
				}
				
					}
				System.out.println("Enter 0 to view options");
				System.out.println("Enter any key to exit");
				l=sc.nextInt();
			}while(l==0);
				System.out.println("Exit succesful");
			
		}

	}




