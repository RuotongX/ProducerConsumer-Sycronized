package producerConsumer;

import java.util.concurrent.Semaphore;
/**
 * This class is used to created the semaphore object, and define the buffer size.
 * @author 16935995 15907151
 *
 */

public abstract class Constants {
	public static final int BUFFER_SIZE =5;
	public static Semaphore empty = new Semaphore(BUFFER_SIZE);
	public static Semaphore full = new Semaphore(0); // FIXME may not be correct the amount of semaphores
	public static Semaphore mutex = new Semaphore(1);
	
}
