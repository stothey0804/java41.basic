package test;

public class ShopApp {

	public static void main(String[] args) {
				Shop[] shop = new Shop[3];
				for(int i = 0 ; i < shop.length ; i++) {
					shop[i] = new Shop(); // initialize
					shop[i].inputInfo();
				}
				for(int i = 0 ; i < shop.length ; i++) {
					shop[i].printTotal();
				}				
	}

}
