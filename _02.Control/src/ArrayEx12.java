
public class ArrayEx12 {
	public static void main(String[] args) {
//		int no[] = { 10, 20, 30, 40 };
//		System.out.println(no.length);
////		System.out.println( no[0] );
////		System.out.println( no[1] );
////		System.out.println( no[2] );
//		for(int i=0; i<no.length; i++) {
//			System.out.println( no[i] );
//		}
//		
		int no[][] = { {10, 20, 30, 40}
					 , {1, 2, 3} 
					 , {1, 2, 3, 4} 
					 };
		
//		System.out.println(no.length);
//		System.out.println(no[0].length);
//		System.out.println(no[1].length);
		
		for(int i=0; i<no.length; i++) {
//			System.out.println(i);
//			System.out.println(no[i]);
			System.out.print( (i+1)+"행: ");
			for(int j=0; j<no[i].length; j++) {
				System.out.print( no[i][j] +" ");
			}
			System.out.println();
		}
		
		
	}
}
