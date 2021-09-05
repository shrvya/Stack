package stack;

/*
 * this  class has the main method 
 * it calls the methods in StackOperation class
 */
public class QueueTest {

	/*
	 * this is the main method it will create object of Integer type for
	 * StackOpertaion and call method push ,print,pop
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Enqueue<Integer> linklist = new Enqueue<Integer>();
		System.out.println("The Que is :");
		linklist.append(56);
		linklist.append(30);
		linklist.append(70);

		linklist.print();
	}

}
