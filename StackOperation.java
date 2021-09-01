package stack;

/*
 * this class implements stack using linked list
 * head,current are pointers to nodes of linked list
 * 
 */

public class StackOperation<T> {

	Node head;

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
	 * this is push method of stack the last pushed element is at the top this is
	 * same like adding nodes at front in linked list data is the key value of the
	 * node
	 */
	public void push(T data) {

		Node<T> newnode = new Node<T>(data);
		newnode.next = head;
		head = newnode;
	}
	/*
	 * this method will print the linked list tempnode , a node is considered it
	 * acts like a iterator and iterates till last node this method will display
	 * content of linked list
	 */

	public void print() {
		Node<T> tempnode = head;
		while (tempnode.next != null) {
			System.out.print(tempnode.data + "-->");
			tempnode = tempnode.next;
		}
		System.out.println(tempnode.data);
	}
}
