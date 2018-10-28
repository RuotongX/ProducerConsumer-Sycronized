package producerConsumer;

import java.util.Random;
import java.util.Scanner;
/**
 * This is the main class which create the threads and set the program running time(using by thread.sleep).
 * @author 16935995 15907151
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Buffer buffer = new Buffer();
			int sleeptime = 0;
			int producernumber = 0;
			int consumernumber = 0;
			/**
			 * The input part to get the sleep time, producer and consumer number
			 */
			System.out.println("Please input the producer number");
			producernumber = sc.nextInt();
			System.out.println("Please input the consumer number");
			consumernumber = sc.nextInt();
			System.out.println("Please input the sleep time");
			sleeptime = sc.nextInt();
			System.out.println("The producer number is "+producernumber);
			System.out.println("The consumer number is "+consumernumber);
			System.out.println("The sleep time is "+sleeptime);
			
			/**
			 * Create two arrays to store the producers and consumers
			 * using the for loop to create the number that user input for producer and consumer,
			 * and than let them run.
			 */
			Thread[] produ = new Thread[producernumber];
			Thread[] consu = new Thread[consumernumber];
			for(int i = 0;i<producernumber;i++) {
				produ[i] = new Thread(new Producer(buffer));
				
				produ[i].start();
			}
			for(int j = 0;j<consumernumber;j++) {
				consu[j] = new Thread(new Consumer(buffer));
				consu[j].start();
			}
			/**
			 * set the sleep time for this program, after running this time the program will stop.
			 */
			try {
				Thread.sleep(sleeptime * 1000);
			} catch(Exception e) {
			} finally {
				for (Thread p : produ) {
					p.interrupt();
				}
				for (Thread c : consu) {
					c.interrupt();
				}
			}
			
			
		 
	}
}
