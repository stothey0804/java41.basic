package ex200625;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		int num = 0;
		int carIndex = 0;
		int custIndex = 0;
		Car[] cars = new Car[100];
		Customer2[] custs = new Customer2[100];

		while (true) { // flag의 값이 true이므로 조건식은 참이 된다.
			System.out.print(">>선택하세요 [0:나가기, 1:차량등록, 2:고객등록, 3:차량조회, 4:고객조회, 5:차량판매]");

			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);

			if (num == 0) {
				break;
			} else if (num == 1) {
				Car c = new Car();

				boolean bCar = false;
				do {
					System.out.println("차량번호:");
					c.id = Integer.parseInt(scanner.nextLine());
					System.out.println("차량크기(소형(1)/중형(2)/대형(3)):");
					c.carSize = Integer.parseInt(scanner.nextLine());
					System.out.println("차량타입(세단(1)/SUV(2)):");
					c.carType = Integer.parseInt(scanner.nextLine());

					bCar = false;
					for (Car fc : cars) {
						if (fc != null && c.id == fc.id) {
							System.out.println("차량번호가 중복됩니다");
							bCar = true;
							break;
						}
					}
				} while (bCar);

				cars[carIndex] = c;
				carIndex++;
			} else if (num == 2) {
				Customer2 cust = new Customer2();

				System.out.println("고객번호:");
				cust.id = Integer.parseInt(scanner.nextLine());
				System.out.println("고객명:");
				cust.name = scanner.nextLine();

				custs[custIndex] = cust;
				custIndex++;
			} else if (num == 3) {
				for (Car c : cars) {
					if (c != null) {
						System.out.println("차량번호:" + c.id);
						System.out.println("차량크기:" + c.carSize);
						System.out.println("차량타입:" + c.carType);
						System.out.println("----------------------");
					}
				}
			} else if (num == 4) {
				for (Customer2 c : custs) {
					if (c != null) {
						System.out.println("고객번호:" + c.id);
						System.out.println("고객명:" + c.name);
						System.out.println("----------------------");
					}
				}
			} else if (num == 5) {
				FLOOP: while (true) {
					boolean bCar = true;
					while (bCar) {
						System.out.print("고객번호를 등록하세요[0:취소]:");
						int custNo = Integer.parseInt(scanner.nextLine());

						if (custNo == 0)
							break FLOOP;

						for (Customer2 c : custs) {
							if (c != null && custNo == c.id) {
								bCar = false;
								break;
							}
						}
					}

					boolean bCust = true;
					while (bCust) {
						System.out.print("차량번호를 등록하세요[0:취소]:");
						int carNo = Integer.parseInt(scanner.nextLine());

						if (carNo == 0)
							break FLOOP;
						int i = 0;
						for (i = 0; i < cars.length; i++) {
							if (cars[i] != null && carNo == cars[i].id) {
								bCust = false;
								cars[i] = null;
								break;
							}
						}
					}

					// 고객번호, 차량번호를 정상적으로 등록
					if (!bCar && !bCust)
						break;
				}
			}
		} // while문의 끝
	}
}

class Car {
	public int id;
	public int carSize;
	public int carType;
}

class Customer2 {
	public int id;
	public String name;
}
