package Array;

public class BinarySearch {

	public static int BinarySearchIndex(int a[],int l,int r,int target) {
		while(l<=r) {
			int mid = l+(r-l)/2;
			
			if(a[mid] == target) {
				return mid;
			}
			else if(a[mid] > target) {
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {2,3,5,8,10};
		
		int target = 8;
		
		int index = BinarySearchIndex(a,0,a.length-1,target);
		
		
		
		System.out.println("Index is :"+ index);

	}

}
