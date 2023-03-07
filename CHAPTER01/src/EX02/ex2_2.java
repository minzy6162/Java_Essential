/*var 키워드를 사용하여 변수 선언*/
package EX02;

public class ex2_2 {
	public static void main(String[] args) {
		var price = 200; 	// price는 int 타입으로 결정
		var name = "kitae"; // name은 String 타입으로 결정
		var pi = 3.14; 		// pi는 double 타입으로 결정

		System.out.println("price = " + (price + 1000));
		System.out.println("name = " + (name));
		System.out.println("pi = " + (pi * 10));

	}// main

}
/*
[Console]
price = 1200
name = kitae
pi = 31.400000000000002
*/