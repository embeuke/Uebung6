package h3;

public class H3_main {

	public static void main(String[] args) {
		
		int [] a = {1, 2, 3};
		int [] b = {1, 2, 4};
		int [] c = {1, 3, 2};
		int [] d = {1, 2};
		int [] e = {1, 2, 3};
		int [] f = {1, 1, 2};
		
		System.out.println(compareArraysVal(a, f));
		

	}
	
	public static boolean compareArraysVal (int [] a, int [] b) {
		
		if (a.length != b.length) {
			return false; 
		}
		
		
		for(int i = 0; i < a.length; i ++) {
			
			int passtA = 0;
			int passtB = 0;
			
			for(int j = 0; j < a.length; j ++) {
				if(a[j] == a[i] ) {
					passtA ++;
				}
			}
			
			for(int j = 0; j < b.length; j ++) {
				if(b[j] == a[i] ) {
					passtB ++;
				}
			}
			
			if (passtA != passtB) {
				return false;
			}
			
		}
	
		return true;
	}

}
