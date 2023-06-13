package operator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		int n1, n2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력: ");
		n1 = input.nextInt();
		
		String result = (n1 % 2 ==0) ? "짝수":"홀수";
		System.out.println(n1+"="+result);
		
		result = (n1 /3 ==0)? "3의 배수이다." : "";
		
		System.out.print("수 입력: ");
		n1 =input.nextInt();
		System.out.print("수 입력: ");
		n2 =input.nextInt();
		
		result = (n2>n1) ? "n2가 n1보다 크다" : "거짓";
		System.out.println("n1: "+n1+", n2: "+n2);
		System.out.println(result);

		
		
		
	}

}
