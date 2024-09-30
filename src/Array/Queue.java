package Array;


public class Queue {
	
	int capacity;
	int a[];
	int front;
	int rear;
	
	// Constructor
	Queue(int size){
		this.capacity = size;
		a = new int[capacity];
		front = 0;
		rear = -1;
	}
	
	// To check the Queue is Empty or not
	public boolean isEmpty() {
		
		return rear == -1;
	}
	
	
	//Function to add value in queue
	public void add(int value) {
		if(rear == capacity-1) {
			System.out.println("Queue is full");
			return;
		}
		
		rear++;
		a[rear] = value;
	}
	
	// function to print all data of queue
	public void print() {
		
		for(int k = front;k<=rear;k++) {
			System.out.print(a[k]+" ");
		}
		System.out.println("\n");
	}
	
	//function to remove the data from queue
	public void remove() {
		if(front > rear) {
			System.out.println("Queue is Empty");
			return;
		}
		else {
			for(int k= front;k<rear;k++) {
				
				a[k] = a[k+1];
			}
			rear--;
		}
		System.out.println("\n");
	}
	
	// to get front data
	public int front() {
		if(front > rear) {
			System.out.println("Queue is Empty");
			return 0;
		}
		else {
			return a[front];
		}
	}
	
	
	public static void main(String[] args) {
		Queue q = new Queue(4);
		System.out.println(q.isEmpty());
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		q.print();
		q.remove();
		q.print();
		q.remove();
		q.print();
		
		System.out.println(q.front());
	}

}
