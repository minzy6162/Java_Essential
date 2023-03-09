/* 추상 클래스 Calculator는 add, subtract, average 메소드를 추상 메소드로 선언하였을 뿐 어떻게 구현할지는 상관하지 않느낟.
 * 어떤 인자가 전달되고 어떤 타입의 값이 리턴되는지만 지정할 뿐이다.
 * 구현은 서브 클래스의 몫이다. */
package EX05;

abstract class Calculator {
	public abstract int add(int a, int b);// 두 정수의 합을 구하는 리턴
	public abstract int subtract(int a, int b);// 두 정수의 차를 구하여 리턴
	public abstract double average(int[] a);// 정수 배열의 평균 리턴
}

public class ex5_5 extends Calculator {

	@Override
	public int add(int a, int b) {// 추상 메소드 구현
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {// 추상 메소드 구현
		return a - b;
	}

	@Override
	public double average(int[] a) {// 추상 메소드 구현
		double sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum / a.length;

	}

	public static void main(String[] args) {
		ex5_5 c = new ex5_5();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] { 2, 3, 4 }));

	}// main

}
/*
[Console] 
5
-1
3.0
 */