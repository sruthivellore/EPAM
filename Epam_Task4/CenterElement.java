public class CenterElement
{
	private Node head;
 
	private static class Node {
		private int value;
		private Node next;
 
		Node(int value) {
			this.value = value;
 
		}
	}
 
	public void Insert(Node node) {
 
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
	}
 
 
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public Node findMiddleNode(Node head)
	{
		Node slowPointer, fastPointer; 
		slowPointer = fastPointer = head; 
 
		while(fastPointer !=null) { 
			fastPointer = fastPointer.next; 
			if(fastPointer != null && fastPointer.next != null) { 
				slowPointer = slowPointer.next; 
				fastPointer = fastPointer.next; 
			} 
		} 
 
		return slowPointer; 
 
	}
 
	public static void main(String[] args) {
		CenterElement list = new CenterElement();
		Node head=new Node(5);
		list.Insert(head);
		list.Insert(new Node(6));
		list.Insert(new Node(7));
		list.Insert(new Node(1));
		list.Insert(new Node(2));
 
		list.printList();
		// finding middle element
		Node middle= list.findMiddleNode(head);
		System.out.println("Middle node will be: "+ middle.value);
 
	}
 
}
