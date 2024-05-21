
public class LoopEx03 {
	public static void main(String[] args) {
		//구구단 가로 출력하기
		//2	x 1	= 2		3	x	1	=	3		4	x	1	=	4		5	x	1	=	5		6	x	1	=	6		7	x	1	=	7		8	x	1	=	8		9	x	1	=	9
		//...
		//2	x 9	= 18	3	x	9	=	27		4	x	9	=	36		5	x	9	=	45		6	x	9	=	54		7	x	9	=	63		8	x	9	=	72		9	x	9	=	81			

		for(int no=1; no<=9; no++) {
//			System.out.printf("2 x %d = %d", no, 2*no);
			for(int dan=2; dan<10; dan++) {
				System.out.printf("%d x %d = %d \t", dan, no, dan*no);
			}
			System.out.println();
		}
		
		
		
//		for(int dan=2; dan<10; dan++) {
//			System.out.printf("%d x 1 = %d \t", dan, dan*1);
//		}
//		System.out.println();
//		
//		//2	x	2	=	4		3	x	2	=	6		4	x	2	=	8		5	x	2	=	10		6	x	2	=	12		7	x	2	=	14		8	x	2	=	16		9	x	2	=	18
//		for(int dan=2; dan<10; dan++) {
//			System.out.printf("%d x 2 = %d \t", dan, dan*2);
//		}
//		System.out.println();
//		
//		//2	x	3	=	6		3	x	3	=	9		4	x	3	=	12		5	x	3	=	15		6	x	3	=	18		7	x	3	=	21		8	x	3	=	24		9	x	3	=	27
//		for(int dan=2; dan<10; dan++) {
//			System.out.printf("%d x 3 = %d \t", dan, dan*3);
//		}
//		System.out.println();
//		
//		//...
//		//2	x	3	=	6		3	x	3	=	9		4	x	3	=	12		5	x	3	=	15		6	x	3	=	18		7	x	3	=	21		8	x	3	=	24		9	x	3	=	27
//		for(int dan=2; dan<10; dan++) {
//			System.out.printf("%d x 9 = %d \t", dan, dan*9);
//		}
		
	}
}
