package producerConsumer;
import java.util.Random;

public class Producer implements Runnable {
	Random ra = new Random();
	long sleeptime;
	int insertnumber;
	Buffer temp;
	int depender = 1;
	public Producer(Buffer buffer) {
		this.temp = buffer;
	}
	
	public void run() {
		long threadId = Thread.currentThread().getId();
		
		while(depender == 1) {
			sleep();
			System.out.println("ThreadID "+threadId);
			insertnumber = ra.nextInt(Integer.MAX_VALUE);
			depender = temp.insert_item(insertnumber);
			if(depender == 1) {
				System.out.println("The value of the produced item is: "+insertnumber);
			} else {
				System.out.println("The buffer is full.");
			}
			System.out.println("The number of items currently in the buffer is "+temp.counter);
			System.out.println();
		}
	}
	private void sleep() {
		sleeptime = (long)ra.nextInt(1000);
		try {
			Thread.sleep(sleeptime);
			System.out.println("The sleeping time is "+sleeptime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
