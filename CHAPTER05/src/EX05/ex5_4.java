/* Shape의 draw() 메소드를 Line, Circle, Rect 클래스에서 목적에 맞게 오버라이딩하는 다형성의 사례를 보여준다. */
package EX05;

class Shape {// 도형의 슈퍼 클래스
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {// 메소드 오버라이딩
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {// 메소드 오버라이딩
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {// 메소드 오버라이딩
	public void draw() {
		System.out.println("Circle");
	}
}

public class ex5_4 {
	static void paint(Shape p) { // Shape을 상속받은 모든 객체들이 매개 변수로 넘어올 수 있음.
		p.draw();// p가 가리키는 객체에 오버라이딩한 draw() 호출. 동적 바인딩
	}

	public static void main(String[] args) {
		Line line = new Line();
		paint(line);// Line의 draw() 실행, "Line" 출력

		// 다음 호출들은 모두 paint() 메소드 내에서 Shape에 대한 래퍼런스 p로 업케스팅됨
		paint(new Shape());// Shape의 draw() 실행. "Shape" 출력
		paint(new Line());// 오버라이딩된 메소드 Line의 draw() 실행, "Line" 출력
		paint(new Rect());// 오버라이딩된 메소드 Rect의 draw() 실행, "Rect" 출력
		paint(new Circle());// 오버라이딩된 메소드 Circle의 draw() 실행, "Circle" 출력

	}// main

}
/*
[Console] 
Line
Shape
Line
Rect
Circle
 */