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
		super(x,y);
		this.z = z;
		
	}
	public void pr() {
		System.out.println(z+":"+y+":"+x);
	}
}




public class Ex08 {

	public static void main(String[] args) {
		Child13 ch = new Child13(10,20,30);
		Parent13 p = new Parent13();
		ch.pr();
		System.out.println(p.x);
		
		
	}

}
