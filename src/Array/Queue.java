package Array;


public class Queue {
	
	int capacity;
	int a[];
	int front;
	int rear;
	
	Queue(int size){
		this.capacity = size;
		a = new int[capacity];
		front = 0;
		rear = -1;
	}
	
	public boolean isEmpty() {
		//System.out.println("Queue is Empty");
		return rear == -1;
	}
	
	public void add(int value) {
		if(rear == capacity-1) {
			System.out.println("Queue is full");
			return;
		}
		
		rear++;
		a[rear] = value;
	}
	
	public void print() {
		
		for(int k = front;k<=rear;k++) {
			System.out.print(a[k]+" ");
		}
		System.out.println("\n");
	}
	
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
