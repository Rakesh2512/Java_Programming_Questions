package Array;

import java.util.PriorityQueue;



class pair{
	
	int count;
	char ch;
	
	pair(int count,char ch){
		this.count = count;
		this.ch =ch;
	}
}

public class GreedyProblem {
	
	

	public static void main(String[] args) {
		
		PriorityQueue<pair>pq = new PriorityQueue<>((a,b)-> a.count - b.count);
		
		pq.add(new pair(3,'a'));
		pq.add(new pair(2,'b'));
		pq.add(new pair(1,'c'));
		
		
		while(!pq.isEmpty()) {
			
			pair p = pq.peek();
			pq.poll();
			System.out.println(p.count+" "+p.ch);
		}

	}

}
