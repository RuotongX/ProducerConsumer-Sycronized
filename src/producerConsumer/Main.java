package producerConsumer;

public class Main {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Producer producer = new Producer(buffer);
		Consumer consumer = new Consumer(buffer);
		Thread tp1 = new Thread(producer);
		Thread tc1 = new Thread(consumer);
		Thread tp2 = new Thread(producer);
		Thread tc2 = new Thread(consumer);
		Thread tp3 = new Thread(producer);
		Thread tc3 = new Thread(consumer);
		Thread tp4 = new Thread(producer);
		Thread tc4 = new Thread(consumer);
		Thread tp5 = new Thread(producer);
		Thread tc5 = new Thread(consumer);

		System.out.println("Producer number is 5");
		System.out.println("Consumer number is 5");
		tp1.start();
		tc1.start();
		tp2.start();
		tc2.start();
		tp3.start();
		tc3.start();
		tp4.start();
		tc4.start();
		tp5.start();
		tc5.start();
	}
}
