package exercise;

public class ShopService {
	//정적 필드 p243
	private static ShopService shopService = new ShopService();
	
	private ShopService () {}

	static ShopService getInstance() {
		return shopService;
	}
}
