package softleak;
import java.util.UUID;


public class GeneratingProductTask implements Runnable {

	private ProductManager pm;

	public GeneratingProductTask(ProductManager pm) {
		this.pm = pm;
	}

	@Override
	public void run() {
		while (true) 
		{
			try {
				//This is just to slow things down so we can see what's going on!
				Thread.sleep(2);
			} catch (InterruptedException e) {
			}
			String name = UUID.randomUUID().toString();
			Product c = new Product(name);
			pm.add(c);
		}
	}
}



