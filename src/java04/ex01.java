package java04;
class ex02{
	private static int a =10;
	private int b= 20;
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		ex02.a = a;
	}

}
public class ex01 {

	public static void main(String[] args) {
		ex02 ex = new ex02();
		ex02 ex2 = new ex02();
		
		ex.setA(20);
		System.out.println(ex2.getA());
		
	} // 

}
