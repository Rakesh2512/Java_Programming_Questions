package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	// Given an  array  and SumTarget
	
	
	
	public static int[] FindTwoElement(int[] a,int target) {
		Map<Integer,Integer>mp = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			if(mp.containsKey(target-a[i])) {
				a[0] = mp.get(target-a[i]);
				a[1] = i;
			}
			mp.put(a[i], i);
		}
		return a;
	}
	public static void main(String[] args) {
		int[] a = {2,7,11,15};
		int target = 18;
		
		int[] ans = FindTwoElement(a,target);
		
		System.out.println(ans[0]+" "+ans[1]);
		
	}

}