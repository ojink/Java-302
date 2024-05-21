
public class LoopEx05 {
	public static void main(String[] args) {
//		직각삼각형 		
//		*          1회 - 별1회
//		**         2회 - 별2회
//		***        3회 - 별3회
//		****       4회 - 별4회
//		*****      5회 - 별5회
		for(int row=1; row<=5; row++) {
//			//row:1 
//			System.out.print("*");
//			System.out.println();
//			//row:2 
//			System.out.print("*");
//			System.out.print("*");
//			System.out.println();
//			//row:5 
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.println();
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
