package scanner;

import java.util.Scanner;

public class TestClass01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		String name;
		
		System.out.print("이름 입력: ");
		name = input.next(); //문자열을 입력받을 때, 사용하는 기능
		
		System.out.print("수 입력: ");
		num = input.nextInt(); //정수입력
		
		System.out.println("이름: "+ name);
		System.out.println("수 : "+num);
	}

}
