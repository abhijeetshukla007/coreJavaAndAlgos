package core.java.experiments;

public class HammingWeight {
	public static void main(String[] args) {
		HammingWeight weight=new HammingWeight();
	//	System.out.println(weight.hammingWeight(5));
		System.out.println(weight.bitcount(16));
		System.out.println(16&15);
	}

	public int hammingWeight(int n) {
		int count = 0;
		for (int i = 1; i < 33; i++) {
			System.out.println("loop");
			if (getBit(n, i) == true) {
				count++;
			}
		}
		return count;
	}

	public boolean getBit(int n, int i) {
		return (n & (1 << i)) != 0;
	}
	
	int bitcount(int n) {
	  int  count = 0;
	    while (n > 0){
	    	System.out.println("ooop");
	        count = count + 1;
	        n = n & (n-1);
	    }
	    return count;
}
}