package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RankTransformOfAnArray {

	public static void main(String[] args) {
		
		// print the rant according to their highest number leetcode - 1331
		
		
		int[] a = {37,12,28,9,100,56,80,5,12};
		
		int[] b = a.clone();
		
		int n = a.length;
		
		Map<Integer,Integer>mp = new HashMap<>();
		
		Arrays.sort(b);
		
		for(int x : b) {
			System.out.print(x+" ");
		}
		System.out.println("\n");
		int index = 1;
		for(int i=0;i<n;i++) {
			if(!mp.containsKey(b[i])) {
				mp.put(b[i], index);
				index++;
			}
			
		}
		int[] ans = new int[n];
		
		for(int i=0;i<n;i++) {
			
			ans[i] = mp.get(a[i]);
		}
		
		for(int x :ans) {
			System.out.print(x+" ");
		}
	}

}
