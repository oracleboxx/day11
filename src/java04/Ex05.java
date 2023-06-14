package java04;
/*1.상속관계에서 부모클래스 메서드 이름 , 리턴타입, 전달인자 개수 , 전달인자 타입이 
 * 동일한 원형을 그대로 자손클래스로 상속받은 상태에서 중괄호{}내의 실행문장을 
 * 자손에 맞게 변경하는 것을 메서드 오버라이딩 이라고 한다.
 * 2.클래스 소속의 구성 요소중 생성자는 상속되지 않는다. 생성자 오버라이딩 문법은 
 *   존재하지 않는다
 * 
 */


class Parent10 {
	public void p10() {
		System.out.println("부모 클래스에서 정의된 메서드 p10()");
	}
}
class Child10 extends Parent10{

	public void p10() {
		System.out.println("오버라이딩 한 메서드 p10()");
	}
	public void ch10() {
		System.out.println("자손에서 정의된 메서드 ch10()");
	}
}
public class Ex05 {

	public static void main(String[] args) {
		Child10 ch =new Child10();
		ch.p10();
		ch.ch10();
	
	
	}

}
