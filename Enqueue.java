package stack;

/*
 * this class implements queue using linked list.it uses generics
 * head,current,temp are pointers to nodes of linked list
 * temp,current can be used to iterate through the linked list
 *boolean variable empty is used see if linked list is empty
 */

public class Enqueue<T> {

	Node head, temp, tail, current;
	Boolean empty = false;

	/*
	 * this class is used to create nodes for linked list data is the key value of
	 * linked list next points to next node in linked list
	 */
	class Node<T> {
		T data;
		Node<T> next;

		/*
		 * this is a constructor of class Node this constructor will create node with
		 * data of type T and next will be null
		 */
		Node(T d) {
			data = d;
			next = null;
		}

	}

	/*
	 * this method will add new nodes to then end data refers to data in the node
	 * current is a pointer to nodes and keeps iterating the linked list head will
	 * point to first node.Since it is a queue first element will remain first last
	 * added element will be last
	 */
	public void append(T data) {
		Node newnode = new Node(data);
		if (head == null) {

			head = newnode;
			tail = head;
			current = head;

		} else {

			tail.next = newnode;
			tail = newnode;

		}
		System.out.println("Elements of Que after appending :  ");
		print();

	}

	/*
	 * this method is used to add elements from front end of the queue a node is
	 * created,new nodes are added to left of first node head will point to last
	 * added node
	 */
	public void add(T data) {
		Node newnode = new Node(data);
		if (head == null) {

			head = newnode;
			tail = head;

		} else {

			head = newnode;
			head.next = current;
			current = head;

		}
		System.out.println("Elements of Que after adding :  ");
		print();

	}

	/*
	 * this method is used to remove nodes from rear end if list is not empty the
	 * last node is removed from the list tail pointing to last node will point to
	 * last but one node after deletion if the list is empty this will display a
	 * message
	 */
	public void deleteRear() {
		if (!isEmpty()) {
			if (head.next == null) {
				head = null;
			}
			temp = head.next;
			current = head;
			while (temp.next != null) {
				temp = temp.next;
				current = current.next;
			}
			tail = current;
			tail.next = null;
		} else {
			System.out.println("Queue is empty!!");
		}
		System.out.println("Elements of Que after deleting from Rear end :  ");
		print();
	}

	/*
	 * this method is used to remove nodes from front end if list is not empty the
	 * first node is removed from the list tail pointing to last node will point to
	 * last but one node after deletion if the list is empty this will display a
	 * message this method will return a node
	 */
	public Node deleteFront() {
		if (!isEmpty()) {
			if (head.next == null) {
				head = null;
			}
			temp = head.next;
			current = head;
			head = temp;
		} else {
			System.out.println("Queue is empty!!");
		}
		System.out.println("Elements of Que after deleting from front end :  ");
		print();
		return current;

	}

	/*
	 * this method will count the number Elements in the Queue if Queue is not empty
	 * if queue is empty it will display a message
	 */
	public void countElements() {
		int count = 0;
		if (!isEmpty()) {
			temp = head;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			System.out.println("No of elements =" + count);
		} else {
			System.out.println("Queue is empty!!!!");
		}
	}

	/*
	 * this method is used to check if linked list is empty it returns boolean true
	 * or false if head is null then true is returned ,meaning list is empty
	 */
	public Boolean isEmpty() {
		temp = head;
		if (temp == null) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * this method will print the linked list tempnode , a node is considered it
	 * acts like a iterator and iterates till last node this method will display
	 * content of linked list.if the list is empty it will display a message this
	 * doesnt return anything
	 */
	public void print() {
		Node<T> tempnode = head;
		if (!isEmpty()) {

			while (tempnode.next != null) {
				System.out.print(tempnode.data + "-->");
				tempnode = tempnode.next;
			}
			System.out.println(tempnode.data);
		} else {
			System.out.println("Queue is empty!!!!");
		}
	}
}
