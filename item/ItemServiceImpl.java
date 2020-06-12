package item;

public class ItemServiceImpl implements ItemService {
	private Item[] list;
	private int index;
	
	public ItemServiceImpl() {
		list = new Item[3];
		index = 0;
	}
	
	@Override
	public void addCart(Item item) {
		if(index >= 3) {
			System.out.println("장바구니가 꽉 찼습니다.");
		}else { list[index++] = item; }
			
	}

	@Override
	public Item[] list() {
		return list;
	}

}
