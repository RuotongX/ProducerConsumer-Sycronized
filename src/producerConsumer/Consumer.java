package producerConsumer;
import java.util.Random;

public class Consumer implements Runnable {
	long sleeptime;
	int removenumber;
	Buffer temp;
	int depender = 1;
	public Consumer(Buffer buffer) {
		this.temp = buffer;
		
	}
	
	public void run() {
		long threadId = Thread.currentThread().getId();
		
		while(true) {
			sleep();
			System.out.println("ThreadID "+threadId);
			removenumber = temp.getItem();
			depender = temp.remove_item(removenumber);
			if(depender == 1) {
				System.out.println("The value of the consumed item is: "+removenumber);
			} else {
				System.out.println("No value in the buffer right now");
			}
			System.out.println("The number of items currently in the buffer is "+temp.counter);
			System.out.println();
		}
	}
	private void sleep() {
		Random ra = new Random();
		sleeptime = (long)ra.nextInt(1000);
		try {
			Thread.sleep(sleeptime);
			System.out.println("The sleeping time is "+sleeptime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
