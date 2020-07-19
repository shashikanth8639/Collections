package com.epam.collections;

import java.util.*;

 class App 
{
    public static void main( String[] args )
    {
    	LinkedList<Integer> linkedlist = new LinkedList<Integer>(); 
		Scanner sc=new Scanner(System.in);

		linkedlist.add(2); 
		linkedlist.add(3); 
		linkedlist.addLast(10); 
		linkedlist.addFirst(1); 
		linkedlist.add(5); 
		linkedlist.add(6);
		linkedlist.add(7);
		linkedlist.add(8);
		linkedlist.add(9); 
		linkedlist.add(4, 4); 
		
		int index;
		while (true) {
			int op;
			System.out.println("choose an option\n1:insert element\n2:remove element\n3:fetch element at an index\n4:display\n5:exit");
			op=sc.nextInt();
			switch(op) {
			
			case 1:		int e;
						System.out.println("eneter element to be added");
						e=sc.nextInt();
						linkedlist.add(e);
						break;
			case 2:		System.out.println("eneter index of element to be removed");
						index=sc.nextInt();
						if (index>=linkedlist.size())
							System.out.println("there are "+linkedlist.size()+" elements in the list");
						else
							linkedlist.remove(index);
						break;
			case 3:		System.out.println("eneter index of element to be fetched");
						index=sc.nextInt();
						if (index>=linkedlist.size())
							System.out.println("there are "+linkedlist.size()+" elements in the list");
						else
							System.out.println("element fetched :"+linkedlist.get(index));
						break;
			case 4:		System.out.println("Linked List is:"+linkedlist);
						break;
			case 5:		return;
			default:	System.out.println("incorrect input");
						break;
			
			}
		}
    }
}
