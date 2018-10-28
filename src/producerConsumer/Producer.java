package producerConsumer;
import java.util.Random;
/**
 * This class is used to define the producer
 * @author 16935995 15907151
 *
 */
public class Producer implements Runnable {
	Random ra = new Random();
	int insertnumber;
	Buffer temp;
	int depender = 0;
	/**
	 * This is a constructor for this class which create the indicator to the input buffer.
	 * because we want to have only one buffer in this program.
	 * @param buffer
	 */
	public Producer(Buffer buffer) {
		this.temp = buffer;
	}
	/**
	 * This is the run method, the while loop shows the producer will keep producing items,
	 * first is sleep for a random time than it use the empty acquire which means when the buffer is empty,
	 * this lock happen, it must create the item first but the other threads can not work this time.
	 * then it generate the a random item to insert to the buffer
	 * display the thread number
	 * if the buffer is full display the error message of it and not let that insert into buffer, else display what number has insert into the array
	 * and display the message for the numbers in the buffer array
	 * finally when the buffer is full the thread is unlock which is full.released so that the other thread can work now.
	 */
	public void run() {
		while(true) {
			try {
				Thread.sleep(ra.nextInt(1000));
				
				Constants.empty.acquire();
			} catch (InterruptedException e) {
				return;
			}
			
			insertnumber = ra.nextInt(Integer.MAX_VALUE);
			try {
				depender = temp.insert_item(insertnumber);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			long threadId = Thread.currentThread().getId();
			System.out.println("Producer Thread "+threadId);
			if(depender == 0) {
				System.out.println("The value of the produced item is: "+insertnumber);
			} else {
				System.out.println("The buffer is full.");
				
			}
		
			System.out.println("The number of items currently in the buffer is "+temp.counter);
			System.out.println();
			Constants.full.release();
		}
	}
}
