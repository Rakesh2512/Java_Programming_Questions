package Array;

public class maxSwap {

	public static void main(String[] args) {
		int num = 2736;
		
		char[] ch = Integer.toString(num).toCharArray();
		int[] last = new int[10];
		
		for(int i=0;i<ch.length;i++) {
			
			System.out.println(ch[i]-'0'+" ->"+i);
			
			last[ch[i]-'0'] = i;
		}
		
		System.out.println("\n");
		for(int i=0;i<10;i++) {
			System.out.print(last[i]+" ");
		}
	}

}
