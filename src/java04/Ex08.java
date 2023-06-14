package java04;
class Parent13{
	protected int x;
	protected int y;
	public Parent13() {
		super();//생략 가능함
	}
public Parent13(int x, int y) {
		this.x =x;
		this.y =y;
	}
	
	
}
class Child13 extends Parent13{
	protected int z;
	
	public Child13() {
		
	}
	public Child13(int x, int y,int z) {
		super(x,y); // 부모 클래스의 오버로딩 된 생성자 호출 , 항상 첫줄에 먼저 사용
		this.z = z;
		
	}
	public void pr() {
		System.out.println(z+":"+y+":"+x); 
		// 자손 클래스의 전달인자 3개짜리 오버로딩 된 생성자 호출
	}
}




public class Ex08 {

	public static void main(String[] args) {
		Child13 ch = new Child13(10,20,30);
		Parent13 p = new Parent13();
		ch.pr();
		System.out.println(p.);
		
		
	}

}
