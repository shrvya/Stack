package stack;

/*
 * this class implements stack using linked list
 * head,current,temp are pointers to nodes of linked list
 * temp,current can be used to iterate through the linked list
 */

public class StackOperation<T> {

	Node head, current, temp;
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
	 * this is push method of stack the last pushed element is at the top this is
	 * same like adding nodes at front in linked list data is the key value of the
	 * node.this method doesnt return anything
	 */
	public void push(T data) {

		Node<T> newnode = new Node<T>(data);
		newnode.next = head;
		head = newnode;
	}

	/*
	 * this method will remove nodes one by one till list is empty the last inserted
	 * node is popped first .temp will point to head
	 * 
	 */
	public void pop() {

		temp = head;
		while (head != null) {
			temp = head;
			System.out.println("Popped :" + temp.data);
			head = temp.next;
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
			System.out.println("Stack is empty!!!!");
		}
	}
}
