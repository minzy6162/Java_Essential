/* instanceof 연산자를 이용하여 상송 관계에 따라 레퍼런스가 가리키는 객체의 타입을 알아본다.
 * 실행 결과는 무엇인가? */
package EX05;

class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}

public class ex5_3 {
	static void print(Person p) {
		if (p instanceof Person) {
			System.out.print("Person ");
		}
		if (p instanceof Student) {
			System.out.print("Student ");
		}
		if (p instanceof Researcher) {
			System.out.print("Researcher ");
		}
		if (p instanceof Professor) {
			System.out.print("Professor ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student() -> ");
		print(new Student());
		System.out.print("new Researcher() -> ");
		print(new Researcher());
		System.out.print("new Professor() -> ");
		print(new Professor());

	}// main

}
/*
[Console] 
new Student() -> Person Student 
new Researcher() -> Person Researcher 
new Professor() -> Person Researcher Professor 
 */