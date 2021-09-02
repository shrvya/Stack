package stack;

/*
 * this  class has the main method 
 * it calls the methods in StackOperation class
 */
public class StackTest {

	/*
	 * this is the main method it will create object of Integer type for
	 * StackOpertaion and call method push ,print,pop
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		StackOperation<Integer> linklist = new StackOperation<Integer>();
		System.out.println("The Stack is :");
		linklist.push(70);
		linklist.push(30);
		linklist.push(56);
		linklist.print();
		linklist.pop();
		linklist.print();
	}

}
