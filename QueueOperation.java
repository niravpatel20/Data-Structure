class Queue{
	
	int queue[] = new int[5];
	int size = 0;
	int front = 0;
	int rear = 0;
	
	public void enQueue(int data){
		if(!isFull()){
		queue[rear] = data;
		rear = (rear + 1)%5;
		size++;
		}
		else{
			System.out.println("Queue is Full");
		}
	}
	
	public void deQueue(){
		if(!isEmpty()){
		int data = queue[front];
		front = (front + 1) %5;
		size--;
		}
		else{
			System.out.println("Queue is Empty");
		}
	}
	
	public boolean isFull(){
		return size == 5;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void show(){
		for(int i = 0; i<size; i++){
			System.out.print("| " + queue[(front+i)%5] + " | ");
		}
		System.out.println();
		System.out.println();
	}
	public int getSize(){
		return size;
	}
}

public class QueueOperation{
	public static void main(String str[]){
		Queue q = new Queue();
		q.enQueue(34);
		q.show();
		q.enQueue(89);
		q.show();
		q.enQueue(45);
		q.show();
		q.enQueue(67);
		q.show();
		q.enQueue(19);
		q.show();
		q.enQueue(60);
		q.show();
		System.out.println("Size of Queue is : " + q.getSize());
		q.deQueue();
		System.out.println("Size of Queue is : " + q.getSize());
	}
}
