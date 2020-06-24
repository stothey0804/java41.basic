package assignment;

import java.util.Scanner;

/*
 * •실습2: 급여계산하기
- 입력:기본급, 직책(사원/대리/과장/부장)
- 출력:실수령액 =xxx원

* 계산식은 다음과 같다
- 실수령액 = 기본급 +직책수당 – 세금

-세금 = 기본급의 10%
* 직책 수당표
- 과장: 200,000
- 부장: 500,000
 * */

interface Employee{
	public int getAmount();
}

class Staff implements Employee{

	@Override
	public int getAmount() {
		return 0;
	}
	
}

class AssitantManager implements Employee{

	@Override
	public int getAmount() {
		return 0;
	}
	
}

class Manager implements Employee{

	@Override
	public int getAmount() {
		return 200000;
	}
	
}

class GeneralManager implements Employee{

	@Override
	public int getAmount() {
		return 500000;
	}
	
}



public class SalayApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee employee;
		
		System.out.println("기본급을 입력해주세요.");
		int basicSalay = scan.nextInt();
		while(true) {
			System.out.println("직급을 입력해주세요.");
			String position = scan.next();
			if(position.equals("사원")) {
				employee = new Staff();
				break;
			}else if(position.equals("대리")) {
				employee = new AssitantManager();
				break;
			}else if(position.equals("과장")) {
				employee = new Manager();
				break;
			}else if(position.equals("부장")) {
				employee = new GeneralManager();
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		float tax = 0.1f;
		float salary = ( basicSalay + employee.getAmount() ) - ( basicSalay + employee.getAmount() ) * tax;
		System.out.println("실수령액= " + salary + "원");

		
		
		
		
	}
}
