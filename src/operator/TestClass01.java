package operator;

public class TestClass01 {

	public static void main(String[] args) {
		/*
		+, -, *, /, %
		/ : 정수 / 정수 => 정수(몫)
		  - 실수의 결과를 보고자하면 연산값 중 하나라도 실수값이 있어야한다.
		%(mod) : 정수 % 정수 => 나머지
		  - 짝, 홀 구분
		  - 어떤 수의 배수
		  - 각 자리별로 구분지을 경우
		 */

		int n1=9, n2=2;
		System.out.println(n1/n2);
		System.out.println(n1/(double)n2);
		System.out.println(n1%n2);
		
		/*
		복합 대입 연산자
		a= a + 10 => a += 10
		a = a / 2 => a /= 2
		a = a * 2 => a *= 2
		*/
		
		System.out.println("=== 복합 대입 연산자 ===");
		
		n1 = n2 = 5;
		n1 += 1; //n1(6)=n1(5)+1
		System.out.println(n1);//6
		n1 -= 1; //n1(5)= n1(6)-1
		System.out.println(n1); //5
		n1 *= n2; //n1(25) = n1(5) * n2(5)
		System.out.println(n1); //25
		n1 /= n2; // n1(5) = n1(25) / n2(5)
		System.out.println(n1); //5
		n1 %= n2; // n1(0) = n1(5) % n2(5)
		System.out.println(n1); //0
		
		System.out.println("");
		
		System.out.println("=== 관계 연산자 ===");
		/*
		관계 연산자
		- 결과적으로 true(참) 또는 false(거짓) 표현
		>, <, =>, =<, ==, !=
		a=10, b=5;
		a > b => true
		a <= b => false
		a == b => false
		a != b => true
		
		- 2항 연산자
		a > b > c => 사용할 수 없음.
		*/
		n1 = 5;
		n2=4;
		System.out.println(n1 > n2); //true
		System.out.println(n1 <= n2); //false
		System.out.println(n1 == n2); //false
		System.out.println(n1 != n2); //true
		
		/*
		논린 연산자
		- 결과적으로 참 또는 거짓 표현
		- 여러개의 식을 묶고자 하는 경우 사용
		%%(and) : 모든 값이 참인 경우 참. 하나라도 거짓이 있으면 거짓
		||(or) : 하나라도 참이면 결과는 참. 모두 거짓인 경우 거짓
		!(not) : 결과를 반전 시켜준다. !참 => 거짓, !거짓 => 참
		*/
		int n3 = 10;
		n1 =5; n2 =7;
		System.out.println(n1>n2 && n1>n3); //false
		System.out.println(n2>n1 && n2>n3); //false
		System.out.println(n3>n2 && n3>n1); //true
		System.out.println("-----or-----");
		System.out.println(true || true); //t
		System.out.println(true || false); //t
		System.out.println(false || true); //t
		System.out.println(false || false); //f
		System.out.println("-----and-----");
		System.out.println(true && true); //t
		System.out.println(true && false); //f
		System.out.println(false && true); //f
		System.out.println(false && false); //f
		System.out.println("-----not-----");
		System.out.println(!true); //f
		System.out.println(!false);		//t
		
		System.out.println("증감연산자");
		/*
		증감 연산자
		- 결과적으로 자기 자신을 1즈아 또는 감소한다.
		a = 10;
		++a => a = a + 1; //전치 또는 전위
		--a => a = a - 1; 
		
		a++ => a = a + 1; //후치 또는 후위
		a-- => a = a - 1;
		*/
		n1 =5;
		++n1;
		System.out.println(n1);
		n2=5;
		n2++;
		System.out.println(n2);
		
		System.out.println("------");
		n1 = 10;
		n2 = ++n1; //자기 자신을 먼저 증가하고  나머지 연산 진행
		System.out.println("n1: "+n1);
		System.out.println("n2: "+n2);
		
		n1 = 10;
		n2 = n1++; //모든 연산이 끝나고 제일 마지막에 자기 자신을 증가한다.
		System.out.println("n1: "+n1);
		System.out.println("n2: "+n2);
		
		System.out.println("====================");
		System.out.println("===삼항 연산자(조건연산자) ===");
		/*
		변수 = (조건식) ? 참인경우 : 거짓인경우;
	    */
		n1=10;
		n2=20;
		String result = (n1>n2) ? "n1이 n2보다 크다" : "n2가 n1보다 크다";
		System.out.println(result);
		
		
		
		
		
		
		
		
	}

}
