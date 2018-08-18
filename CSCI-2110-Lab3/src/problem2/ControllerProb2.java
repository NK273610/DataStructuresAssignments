package problem2;

public class ControllerProb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericStack<String> stack1 = new GenericStack<String>();           //Object of generic class created
		stack1.push("London");                                              //Push method called
		stack1.push("Paris");
		stack1.push("Halifax");
		
		GenericStack<Integer> stack2 = new GenericStack<Integer>();         // Object of generic class created
		stack2.push(1);                                                     //Push method called
		stack2.push(2);
		stack2.push(3);
	
		System.out.println(stack1);                                         //Print the elements pushed into stack
		System.out.println(stack2);
		stack1.pop();                                                       //Pop method called
		stack2.pop();
		
		stack1.peek();                                                      //Peek method called
		stack2.peek();
		
		System.out.println(stack1.isEmpty());                               //IsEmpty method called
		System.out.println(stack2.isEmpty());

	}

}
