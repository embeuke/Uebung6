package h1;

public class H1_main {

	public static void main(String[] args) {
		
	}
		
	public static boolean isMirrorArray (int [] a, int [] b) {
		
		
		if (a.length != b.length) {
			return false; 
		}
		
		int passt = 0;
		
		for (int i = 0; i < a.length; i ++) {
			if (a[i] == b[b.length -1 -i]) {
				passt ++;
			}
		}
		
		if (passt == a.length) {
			return true;
		}
		
		return false;
			
	}

}


	
