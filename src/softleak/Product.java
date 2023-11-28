package softleak;
public class Product {

	private int id;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return id + " : " + name;
	}
	
	public Product(String name) {
		super();
		this.name = name;
	}

	
}

