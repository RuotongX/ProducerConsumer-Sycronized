package producerConsumer;
import java.util.Random;
/**
 *  This class is used to define the consumer
 * @author 16935995 15907151
 *
 */
public class Consumer implements Runnable {
	Random ra = new Random();
	int removenumber;
	Buffer temp;
	int depender = 0;
	/**
	 * This is a constructor for this class which create the indicator to the input buffer.
	 * because we want to have only one buffer in this program.
	 * @param buffer
	 */
	public Consumer(Buffer buffer) {
		this.temp = buffer;
		
	}
	/**
	 * This is the run method, the while loop shows the consumer will keep consuming items,
	 * first is sleep for a random time than it use the full acquire which means when the buffer is full,
	 * this lock happen, it must remove the item first but the other threads can not work this time.
	 * then it get the first item of buffer and remove form the buffer
	 * display the thread number
	 * if the buffer is empty display the error message of it and do nothing with buffer, else display what number has remove from the array
	 * and display the message for the numbers in the buffer array
	 * finally when the buffer is empty the thread is unlock which is empty.released so that the other thread can work now.
	 */
	public void run() {
		while(true) {
			try {
				Thread.sleep(ra.nextInt(1000));

				Constants.full.acquire();
			} catch (InterruptedException e) {
				return;
			}

			removenumber = temp.getItem();
			try {
				depender = temp.remove_item(removenumber);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			long threadId = Thread.currentThread().getId();
			
			System.out.println("Consumer Thread "+threadId);
			if(depender == 0) {
				System.out.println("The value of the consumed item is: "+removenumber);
			} else {
				System.out.println("No value in the buffer right now");
				
			}

			System.out.println("The number of items currently in the buffer is "+temp.counter);
			System.out.println();
			Constants.empty.release();
		}
	}
	
}
