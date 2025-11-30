package h3;

public class H3_main {

	public static void main(String[] args) {
		
	
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
