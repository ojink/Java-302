
public class LoopEx06 {
	public static void main(String[] args) {
		//직각삼각형
//		*****   1행 - 5열  행+열=6 --> 열=6-행   1~5:5
//		****    2행 - 4열                     2~5:4
//		***     3행 - 3열                     3~5:3
//		**      4행 - 2열                     4~5:2 
//		*       5행 - 1열                     5~5:1
		for(int row=1; row<=5; row++) {
			for(int col=5; col>=row; col--) { //5>=1:T
				System.out.print("*");
			}
			System.out.println();			
		}
//		for(int row=1; row<=5; row++) {
//			for(int col=row; col<=5; col++) {
//				System.out.print("*");
//			}
//			System.out.println();			
//		}
//		for(int row=1; row<=5; row++) {
//			for(int col=1; col<=6-row; col++) {
//				System.out.print("*");
//			}
//			System.out.println();			
//		}
		
	}
}
