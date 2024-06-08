package dsa;

public class LinkedList<T> {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(1);
		linkedList.add(8);
		linkedList.add(0);
		linkedList.add(7);
		linkedList.prepend(99);
		linkedList.deleteValue(5);
		linkedList.print();
		System.out.println("Middle is ::"+linkedList.middle());
		linkedList.reverse();
		System.out.println();
		linkedList.print();
		
	}

	Node<T> head = null;

	public LinkedList() {
		// empty
	}

	//
	public void add(T data) {

		Node<T> curr = new Node<T>(data);

		if (head == null) {
			head = curr;
			return ;
		}
		Node<T> tmp = head;
		while(tmp.next!=null) {
			tmp = tmp.next;
		}
		
		tmp.next = curr ;

	}
	
	public T middle() {
		
		if(head==null || head.next==null) {
			return null;
		}
		
		
		//99->1->2->3->4->1->8->0->7
		Node<T> slow = head;
		Node<T> fast = head;
		
		while(fast.next!=null && fast!=null && slow!=null) {
			fast= fast.next.next;
			slow= slow.next;
		}
		
		return slow.data;
		
	}

	public void reverse() {
		//   t
		//<-1 2 2->3->4->5
		Node<T> prevHead =null;
		while(head!=null) {
			Node<T> tmp = head.next;
			head.next = prevHead;
			prevHead = head;
			head = tmp;
			
		}
		
		head=prevHead;
	}
	
	public Node<T> recursiveReverse(Node<T> head) {
		
		if(head==null || head.next==null) {
			return head;
		}
		
		Node<T> newHead = recursiveReverse(head);
		
		Node<T> front = head.next;
		
		front.next = head ;
		
		head.next = null;
		
		return newHead;
		
		
		
	}

	public void prepend(T data) {

		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;
	}

	public void deleteValue(T data) {

		if (head == null)
			return;

		if (head.data == data) {

			head = head.next;
			return;
		}
		Node<T> curr = head;
		while (curr.next != null) {

			if (curr.next.data == data) {
				curr.next = curr.next.next;
			}
			curr = curr.next;
		}

	}

	public void print() {
		Node<T> temp = head;

		while (temp.next != null) {
			System.out.print(temp.data + "->");

			temp = temp.next;
		}
		System.out.print(temp.data);
	}

}

class Node<T> {

	T data;

	public Node(T data) {
		super();
		this.data = data;

	}

	Node<T> next;
}
