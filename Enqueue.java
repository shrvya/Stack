package stack;

/*
 * this class implements stack using linked list
 * head,current,temp are pointers to nodes of linked list
 * temp,current can be used to iterate through the linked list
 * variable empty is used see if linked list is empty
 */

public class Enqueue<T> {

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
	 * this method will add new nodes to then end data refers to data in the node
	 * current is a pointer to nodes and keeps iterating the linked list head will
	 * point to first node.Since it is a queue first element will remain first last
	 * added element will be last
	 */
	public void append(T data) {
		Node newnode = new Node(data);
		if (head == null) {

			head = newnode;
			current = head;

		} else {

			current.next = newnode;
			current = newnode;

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
