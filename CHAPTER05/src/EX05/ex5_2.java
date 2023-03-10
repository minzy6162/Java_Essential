/* super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스 Point의 생성자를 호출하는 예를 보인다. */
package EX05;

class Point1 {
	private int x, y;// 한 점을 구성하는 x, y 좌료

	public Point1() {
		this.x = this.y = 0;
	}

	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {// 점의 좌표 출력
		System.out.println("(" + x + ", " + y + ")");

	}// showPoint
}// Point

class ColorPoint1 extends Point1 {// Point를 상속받는 ColorPoint 선언
	private String color; // 점의 색

	public ColorPoint1(int x, int y, String color) {
		super(x, y);// Point의 생성자 Point(x, y) 호출
		this.color = color;
	}

	public void showColorPoint() {// 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();// Point 클래스의 showPoint() 호출

	}
}

public class ex5_2 {
	public static void main(String[] args) {
		ColorPoint1 cp = new ColorPoint1(5, 6, "blue");
		cp.showColorPoint();

	}// main

}
/*
[Console] 
blue(5, 6)
 */