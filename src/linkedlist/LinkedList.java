package linkedlist;

public class LinkedList {
	private class Node {
		private int value;
		private Node nexet;
		
		public Node(int value) {
			this.value=value;
		}

	} 

	private Node first;
	private Node last;

public void addFirst(int item) {
	 var node=new Node(item);
	 if(first==null) 
		 first=last=node;
	 else {
		 last.nexet=node;
		 last=node;
	 }
	 
}
}
