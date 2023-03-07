/*변수, 리터럴, 상수 사용하기*/
package EX02;

public class ex2_3 {
	public static void main(String[] args) {
		final double PI = 3.14;						//원주율을 상수로 선언
		double radius = 10.2;						//원의 반지름
		double circleArea = radius * radius * PI;	//원의 면적 계산

		// 원의 면적을 화면에 출력한다.
		System.out.print("반지름 = " + radius + ", ");
		System.out.print("원의 면적 = " + circleArea);

	}// main

}
/*
[Console] 
반지름 = 10.2, 원의 면적 = 326.68559999999997
 */