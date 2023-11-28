package softleak;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public class ProductManager {

	private List<Product> products = new ArrayList<Product>();
	private int nextAvalailbleId = 0;
	private int lastId = -1;

	public  void add(Product product) {
		synchronized (this) {
			product.setId(nextAvalailbleId);
			synchronized(products) {
				products.add(product);
			}
			nextAvalailbleId++;
		}

	}

	public Optional<Product> getNext() {

//				if (lastId + 1 > nextAvalailbleId) {
//					lastId++;
//					return Optional.of(products.get(lastId));
//				}
		synchronized (products) {
			if (products.size() > 0) return Optional.of(products.remove(0));
			return Optional.empty();
		}
	}	

	public void printQueueStatus() {
		int size = 0;
		size = products.size();
		System.out.println("" + new Date() + " Products in queue : " + size + " of " + nextAvalailbleId);
	}

}
