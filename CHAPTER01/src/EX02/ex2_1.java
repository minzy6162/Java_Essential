/*Hello, 자바 프로그램의 기본 구조*/
package EX02;

public class ex2_1 {
	public static int sum(int n, int m) {
		return n + m;
	}

	// main() 메소드에서 실행 시작
	public static void main(String[] args) {
		int i = 20; 
		int s;
		int a;
		
		s = sum(i, 10);					//메소드 호출
		a = '?';
		System.out.println(a);			//문자 '?' 출력
		System.out.println("Hello");	//"Hello" 문자열 출력
		System.out.println(s); 			// 정수 s 값 30 출력

	}// main

}
/*
[Console]
63
Hello
30
*/
