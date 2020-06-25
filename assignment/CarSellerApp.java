package assignment;

import java.util.Scanner;

/*
 * • 실습: 차량판매시스템
 * */

interface CarSellerService{
	public void addCar(Scanner scan);
	public void addCustomer(Scanner scan);
	public void printCar();
	public void printCustomer();
	public void sellCar(Scanner scan);
}

class CalSellerImpl implements CarSellerService{
	
	final int MAX = 10;
	private Car[] cars;
	private Customer[] customers;
	private int carCnt, customerCnt, soldCnt;
	private String[] soldCarNums;	
	
	public CalSellerImpl() {
		cars = new Car[MAX];
		customers = new Customer[MAX];
		soldCarNums = new String[MAX];
	}
	
	@Override
	public void addCar(Scanner scan) {
		System.out.println("[차량등록]");
		boolean result = true;
		while(result) {	// 중복여부 체크
			result = false;
			cars[carCnt] = new Car();
			System.out.println("차량번호: ");
			cars[carCnt].setNumber(scan.next());
			System.out.println("차량크기(소형(1)/중형(2)/대형(3)): ");
			cars[carCnt].setSize(scan.nextInt());
			System.out.println("차량타입(세단(1)/SUV(2)):" );
			cars[carCnt].setType(scan.nextInt());
			for(int i = 0; i < carCnt; i++) {
				if(cars[carCnt].getNumber().equals(cars[i].getNumber())) {
					System.out.println("차량번호가 중복됩니다.");
					result = true;
				}
			}
		}		
		carCnt++;
	}

	@Override
	public void addCustomer(Scanner scan) {
		customers[customerCnt] = new Customer();
		System.out.println("[고객등록]");
		System.out.println("고객번호: ");
		customers[customerCnt].setId(scan.next());
		System.out.println("고객명: ");
		customers[customerCnt].setName(scan.next());
		customerCnt++;
	}

	@Override
	public void printCar() {
		System.out.println("[차량조회]");
		for(Car c: cars) {
			if(c != null) {
				System.out.println(c.toString());
				System.out.println("-------------------------------------");
			}else {
				break;
			}
		}
	}

	@Override
	public void printCustomer() {
		System.out.println("[고객조회]");
		for(Customer c: customers) {
			if(c != null) {
				System.out.println(c.toString());
				System.out.println("-------------------------------------");
			}else {
				break;
			}
		}
	}

	@Override
	public void sellCar(Scanner scan) {
		System.out.println("[차량판매]");
		System.out.println("고객번호를 등록하세요[0:취소]:");
		String customerID = scan.next();
		if(customerID.equals("0")) {
			System.out.println("취소합니다.");
			return;
		}
		System.out.println("차량번호를 등록하세요[0:취소]:");
		String carNum = scan.next();
		if(carNum.equals("0")) {
			System.out.println("취소합니다.");
			return;
		}
		boolean check = false;
		for(int i = 0; i < customerCnt; i++) {
			if(customerID.equals(customers[i].getId())) {
				check = true;
			}
		}
		if(!check) {
			System.out.println("고객번호를 등록하세요.");
			return;
		}
		check = false;
		for(int i = 0; i < carCnt; i++) {
			if(carNum.equals(cars[i].getNumber())) {
				check = true;
			}
		}
		if(!check) {
			System.out.println("차량번호를 등록하세요.");
			return;
		}
		
		for(int i = 0; i < soldCnt; i++) {
			if(carNum.equals(soldCarNums[i])) {
				System.out.println("판매된 차량번호입니다. 차량번호를 등록하세요.");
				return;
			}
		}
		soldCarNums[soldCnt] = carNum;
		soldCnt++;
		
		// 판매된차량은 차량조회에서 삭제
		soldCar(carNum);
		
		System.out.println(carNum+"번 차량 판매완료.");
	}
	
	public void soldCar(String num) {
		for(int i = 0; i < carCnt; i++) {
			if(num.equals(cars[i].getNumber())) {
				cars[i].setNumber(cars[carCnt-1].getNumber());
				cars[i].setSize(cars[carCnt-1].getSize());
				cars[i].setType(cars[carCnt-1].getType());
				
			}
		}
		cars[--carCnt] = null;
	}
	
}


class Car{
	private String id;
	private int type, size;

	public String getNumber() {
		return id;
	}
	public int getType() {
		return type;
	}
	public int getSize() {
		return size;
	}
	public void setNumber(String id) {
		this.id = id;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return	"차량번호: "+this.getNumber()
		+"\n차량번호(소형(1)/중형(2)/대형(3)): "+this.getSize()
		+"\n차량번호(세단(1)/SUV(2)): "+this.getType();
	}
	
}

class Customer{
	String id, name;

	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\n고객번호: "+this.getId()+"\n고객번호: "+this.getName();
	}
}

public class CarSellerApp {
	public static void main(String[] args) {
		CarSellerService service = new CalSellerImpl();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("선택하세요. [0:나가기, 1:차량등록, 2:고객등록, 3. 차량조회, 4: 고객조회, 5:차량판매]");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:	// 차량등록
				service.addCar(scan);
				break;
			case 2:	// 고객등록
				service.addCustomer(scan);
				break;
			case 3:	// 차량조회
				service.printCar();
				break;
			case 4:	// 고객조회
				service.printCustomer();
				break;
			case 5:	// 차량판매
				service.sellCar(scan);
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
}
