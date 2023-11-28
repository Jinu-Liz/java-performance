package softleak;
public class ProductMain {
	
	public static void main(String[] args)  {
		ProductManager cm = new ProductManager();
		GeneratingProductTask generateTask = new GeneratingProductTask(cm);
		ProcessingProductTask processTask = new ProcessingProductTask(cm);
		
		for (int user = 0; user < 10; user++) {
			Thread t = new Thread(generateTask);
			t.start();
		}
		Thread t = new Thread(processTask);
		t.start();
		
		//main thread is now acting as the monitoring thread
		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cm.printQueueStatus();
			System.out.println("Available memory: " + Runtime.getRuntime().freeMemory() / 1024 + "k");
			
		}
	}

}
