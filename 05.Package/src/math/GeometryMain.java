package math;

import geometry.*;
import geometry.polygon.*;

public class GeometryMain {
	public static void main(String[] args) {
		Circle r = new Circle(5);
		Square s = new Square(5);
		if( r.getArea() > s.getArea() ) {
			System.out.println("원넓이가 더 넓다");
		}else {
			System.out.println("정사각형넓이가 더 넓다");
		}
	
	}
}
