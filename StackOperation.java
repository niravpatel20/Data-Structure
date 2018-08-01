class Stack{
	
	int stack[] = new int[5];
	int top = -1;
	
	public void push(int data){
		
		if(isFull()){
			System.out.println("\n");
			System.out.println("Stack is Full");
		}
		else{
		top++;
		stack[top] = data;
		}
	}
	
	public void pop(){
		if(isEmpty()){
			System.out.println();
			System.out.println("Stack is Empty");
		}
		else{
		int data = stack[top];
		top--;
		}
	}
	
	public boolean isEmpty(){
		return top<0;
	}
	
	public boolean isFull(){
		return top == 4;
	}
	
	public int size(){
		return top+1;
	}
	
	public void show(){
		for(int i=0; i<=top; i++){
			System.out.print( "| " + stack[i]+ " | ");
		}
	}
}

public class StackOperation{
	public static void main(String str[]){
		Stack s = new Stack();
		s.push(89);
		s.push(12);
		s.push(67);
		s.push(78);
		System.out.println("Size is : " + s.size());
		s.show();
	
		
	}
}
