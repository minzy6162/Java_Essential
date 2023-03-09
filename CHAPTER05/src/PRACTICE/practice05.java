/* 다음 StackInterface는 문자열을 푸시하고 팝을 할 수 있는 스택에 대한 스펙을 정의하고 있다.
 * StackInterface를 상속받는 StringStack 클래스를 구현하라.
 * 그리고 StackManager 클래스에 main() 메소드를 작성하여 StringStack 객체를 생성하고,
 * 사용자로부터 문자열을 5개 읽어 스택 객체를 저장하고, 다시 팝하여 읽은 반대순으로 출력하라. */
package PRACTICE;

public class practice05 {

	public static void main(String[] args) {

	}//main

	interface StackInterface{
		int length();//스택에 들어 있는 문자열 개수 리턴
		String pop();//스택에 톱에 있는 문자열 팝
		boolean push(String ob);//스택의 톱에 문자열 ob 푸시 삽입
	}
}
