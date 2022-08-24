// Question Number 1
package assessment;

import java.util.Iterator;
import java.util.Stack;

public class StackProgram_question1 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(1);
		stack.push(4);
		stack.push(8);
		stack.push(10);
		stack.push(19);
		stack.push(20);
		
		//counting length by iterating
		int count=0;
		int sum=0;
		Iterator<Integer> itor = stack.iterator();
		while (itor.hasNext()) {
			count++;
			sum=sum+itor.next();
		}
		
		System.out.println("Length is: "+count+"\nSum of elements is: "+sum);
		
		//deleting last element
		stack.pop();
		
		//printing the alternate popped elements
		System.out.println("alternate elements: ");
		int flag=count-1;
		while(flag>=1) {
			
			if(flag%2==0) {
				Integer peek= stack.peek();
				System.out.println(peek);
			}
				stack.pop();
			flag--;
		}
		
		
	}
}
