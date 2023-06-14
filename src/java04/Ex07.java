package java04;
class Parent12{
	int a=10;
	int b=20;
}
class Child12 extends Parent12{
	int a=40;
	int b=50;
	int c=30;
	void print() {
		System.out.println("this.a="+this.a+",b="+this.b);
		System.out.println("super.a="+super.a+",b="+super.b);
		
	}
}

public class Ex07 {

	public static void main(String[] args) {
		Child12 ch =new Child12();
		ch.print();
	}

}
