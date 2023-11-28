package softleak;

import java.util.Optional;
import java.util.UUID;

public class ProcessingProductTask implements Runnable {

	private ProductManager pm;

	public ProcessingProductTask(ProductManager pm) {
		this.pm = pm;
	}

	@Override
	public void run() {
		while (true) {

			Optional<Product> customer = pm.getNext();
			if (customer.isEmpty()) {
				// no products in queue so pause for half a second
				try {
					Thread.sleep((50));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				// Processing takes place here
			}
		}

	}

}
