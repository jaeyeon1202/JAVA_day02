package scanner;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		String name;
		int kor, eng, mat, sum;
		Scanner input = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ");
		name = input.next();
		
		System.out.print(name+" 님의 국어 점수: ");
		kor = input.nextInt();
		
		System.out.print(name+" 님의 영어 점수: ");
		eng = input.nextInt();
		
		System.out.print(name+" 님의 수학 점수: ");
		mat = input.nextInt();
		
		sum = kor+ eng + mat;
		
		System.out.println("====================");
		System.out.println("이 름 : "+name);
		System.out.println("====================");
		System.out.println("국 어 : "+kor);
		System.out.println("영 어 : "+eng);
		System.out.println("수 학 : "+mat);
		System.out.println("====================");
		System.out.println("합 계 : "+sum);
		System.out.println("====================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
