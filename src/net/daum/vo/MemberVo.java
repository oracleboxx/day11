package net.daum.vo; // package 키워드로 net.daum.vo 패키지 폴더명을 생성

import java.util.Scanner;

//MemberVo.hava 데이터 저장빈 클래스를 활용하는 예제
public class MemberVo {// 데이터 저장빈 클래스
  private String mem_id;
  private String mem_pwd;
  private String mem_name;
  private String mem_phone;
  private String mem_email;
  
  public String getMem_id() {
	return mem_id;
}

public void setMem_id(String mem_id) {
	this.mem_id = mem_id;
}

public String getMem_pwd() {
	return mem_pwd;
}

public void setMem_pwd(String mem_pwd) {
	this.mem_pwd = mem_pwd;
}

public String getMem_name() {
	return mem_name;
}

public void setMem_name(String mem_name) {
	this.mem_name = mem_name;
}

public String getMem_phone() {
	return mem_phone;
}

public void setMem_phone(String mem_phone) {
	this.mem_phone = mem_phone;
}

public String getMem_email() {
	return mem_email;
}

public void setMem_email(String mem_email) {
	this.mem_email = mem_email;
}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberVo member = new MemberVo();
		System.out.println("아이디");
		String id = scan.next();
		
		System.out.println("비번");
		String pwd = scan.next();
		
		System.out.println("이름");
		String name = scan.next();
		
		System.out.println("번호");
		String phone = scan.next();
		
		System.out.println("이메일");
		String email = scan.next();
		
		member.setMem_id(id);
		member.setMem_pwd(pwd);
		member.setMem_name(name);
		member.setMem_phone(phone);
		member.setMem_email(email);
		System.out.println("아이디"+member.getMem_id());
		System.out.println("비번"+member.getMem_pwd());
		System.out.println("이름"+member.getMem_name());
		System.out.println("번호"+member.getMem_phone());
		System.out.println("이메일"+member.getMem_email());
		
		
	}

}
