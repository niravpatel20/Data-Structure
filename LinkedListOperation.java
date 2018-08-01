class Node{
	int data;
	Node next;
}

class LinkedList{
	Node head;
	
	public void insert(int data){
		Node node  = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null){
			head = node;
		}
		else{
			Node n = head;
			while(n.next!=null){
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAtStart(int data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null){
			head = node;
		}
		else{
			node.next = head;
			head = node;
		}
	}
	
	public void insertAt(int index, int data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index == 0){
			insertAtStart(data);
		}
		else{
			Node n = head;
			for(int i=0; i<index-1; i++){
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void delete(int index){
		if(index == 0){
			head = head.next;
		}
		else{
			Node n = head;
			Node n1;
			for(int i=0; i<index-1; i++){
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}
	
	public void show(){
		Node n  = head;
		while(n.next != null){
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}

public class LinkedListOperation{
	public static void main(String str[]){
		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(78);
		list.insert(89);
		list.insertAtStart(5);
		list.insertAt(2, 56);
		list.delete(2);
		list.delete(0);
		list.insert(67);
		list.show();
	}
}