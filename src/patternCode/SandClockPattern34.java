package patternCode;

public class SandClockPattern34 {

	public static void main(String[] args) {
		
		int num=5;
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(j>=i) { 
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=2;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(j>=6-i) { 
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
