package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>(); // ArrayList를 Product로 캐스팅
    private static ProductRepository instance = new ProductRepository();

    public static ProductRepository getInstance()
    {
	    return instance;
    }


	public ProductRepository() {
		Product phone = new Product("p1234", "재규어", 800000);
		phone.setDescription("포유류 큰고양이과");
		phone.setCategory("Jagure");
		phone.setManufacturer("아프리카");
		phone.setUnitsInStock(50);
		phone.setCondition("좋음");
        phone.setFilename("p1234.jpg");

      
        Product notebook = new Product("p1235", "호랑이", 1500000);
		notebook.setDescription("포유류 큰고양이과");
		notebook.setCategory("Tiger");
		notebook.setManufacturer("아프리카");
		notebook.setUnitsInStock(50);
		notebook.setCondition("좋음");
        notebook.setFilename("p1235.jpg");

		Product tablet = new Product("p1236", "사자", 900000);
		tablet.setDescription("포유류 큰고양이과");
		tablet.setCategory("Lion");
		tablet.setManufacturer("사바나");
		tablet.setUnitsInStock(50);
		tablet.setCondition("좋음");
        tablet.setFilename("p1236.jpg");
        
        Product jagure = new Product("p1237", "새끼재규어", 800000);
		jagure.setDescription("포유류 큰고양이과");
		jagure.setCategory("Jagure");
		jagure.setManufacturer("아프리카");
		jagure.setUnitsInStock(50);
		jagure.setCondition("좋음");
        jagure.setFilename("p1237.jpg");
        
        Product tiger = new Product("p1238", "새끼호랑이", 1500000);
		tiger.setDescription("포유류 큰고양이과");
		tiger.setCategory("Tiger");
		tiger.setManufacturer("아프리카");
		tiger.setUnitsInStock(50);
		tiger.setCondition("좋음");
        tiger.setFilename("p1238.jpg");
		
        Product lion = new Product("p1239", "새끼사자", 900000);
		lion.setDescription("포유류 큰고양이과");
		lion.setCategory("Lion");
		lion.setManufacturer("사바나");
		lion.setUnitsInStock(50);
		lion.setCondition("좋음");
        lion.setFilename("p1239.jpg");
        
        Product rabbit = new Product("p1240", "토끼", 100000);
		rabbit.setDescription("먹이용 토끼");
		rabbit.setCategory("Rabbit");
		rabbit.setManufacturer("아시아");
		rabbit.setUnitsInStock(50);
		rabbit.setCondition("좋음");
        rabbit.setFilename("p1240.jpg");
        
        Product chicken = new Product("p1241", "닭", 20000);
		chicken.setDescription("먹이용 닭");
		chicken.setCategory("Chicken");
		chicken.setManufacturer("대한민국");
		chicken.setUnitsInStock(50);
		chicken.setCondition("좋음");
        chicken.setFilename("p1241.jpg");
        
        Product feed = new Product("p1242", "사료", 15000);
		feed.setDescription("사료");
		feed.setCategory("Feed");
		feed.setManufacturer("국산");
		feed.setUnitsInStock(100000);
		feed.setCondition("좋음");
        feed.setFilename("p1242.jpg");
        
		// 위와 같이 상품 초기화 하고 아래에 상품을 추가

		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
        listOfProducts.add(jagure);
		listOfProducts.add(tiger);
		listOfProducts.add(lion);
        listOfProducts.add(rabbit);
		listOfProducts.add(chicken);
		listOfProducts.add(feed);
		// listOfProducts.add(상품명);
	}

	public ArrayList<Product> getAllProducts() 
    {
		return listOfProducts;
	}
        public Product getProductById(String productId) 
    {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) 
        {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) 
            {
				productById = product;
				break;
			}
		}
		return productById;
	}
    public void addProduct(Product product) 
    {
	    listOfProducts.add(product);
    }
}