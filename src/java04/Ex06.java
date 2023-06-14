package java04;
/* 상속  관계에서 부모클래스 메서드가 자손클래스에서 오버라이딩을 한 경우
 * 부모의 메서드를 호출하고 싶을 때는 super.메서드();를 사용한다. 
 * super는 상속관계에서 부모클래스를 가리키는 참조변수 키워드이다.
 * 
 */
class Parent11{
	int x =20;
	int y; // super.pr(10) 
	public void pr(int x) {
		this.x =x;
		System.out.println("x="+x);
	}
	public void pr(int x , int y) {
		this.x=x;
		this.y=y;
		System.out.println("x="+x+",y="+y);
	}
}
class Child11 extends Parent11{
	int x =10;

	@Override
	public void pr(int x) {
		
		super.pr(x,10);
	}
	
}
public class Ex06 {

	public static void main(String[] args) {
		Child11 ch =new Child11();
		ch.pr(10);
	}

}
