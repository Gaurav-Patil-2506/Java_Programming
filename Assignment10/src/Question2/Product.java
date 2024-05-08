package Question2;


public class Product implements Comparable<Product>  {
	int id;
	String name;
	String Category;
	double price;
	public Product() {
		
	}
	public Product(int id, String name, String category, double price) {
		super();
		this.id = id;
		this.name = name;
		Category = category;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Category=" + Category + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Product o) {
		return this.name.compareTo(o.name) ;
	}
	
	

}
