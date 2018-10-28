package producerConsumer;
import java.util.ArrayList;
/**
 * This class is used to create a buffer and define the basic information about is,
 * the buffer size is get from constants class
 * @author 16935995 15907151
 *
 */
public class Buffer {

	public int[] bufferlist;
	int counter = 0;
	ArrayList<Integer> table = new ArrayList();
	/**
	 * This is the constructor of this class, the for loop inside is used to set each elements' default value to
	 * the minimum value of integer. And this means this place has no value.
	 */
	public Buffer() {
		bufferlist = new int[Constants.BUFFER_SIZE];
		for(int i = 0;i<Constants.BUFFER_SIZE;i++) {
			bufferlist[i] = Integer.MIN_VALUE;
		}
	}
	/**
	 * This method is the insert method for buffer array, because I want to make a circular array,
	 * the for loop is used to check which position in this array is empty and put the item in it, the counter plus 1, the method return 0 which means insert success.
	 * when the counter is equal to 5, it will return -1 which means insert fail.
	 * @param item
	 * @return
	 * @throws InterruptedException
	 */
	public int insert_item(int item) throws InterruptedException {

		
		if(counter == Constants.BUFFER_SIZE) {
		

			return -1;
		} else {
			
			for(int i=0;i<bufferlist.length;i++) {
				if(bufferlist[i] == Integer.MIN_VALUE) {
					
					bufferlist[i] = item;
					counter++;
					table.add(item);

					
					return 0;
				} 
			}
		return 0;
		}
	}
	/**
	 * This method is the remove method for buffer array, because I want to make a circular array,
	 * it gets the item and use for loop to find which one is the input item and delete,
	 * due to the reason that I call this method used for delete the first item of the array. 
	 * it is basically like the queue just get the earliest value that add to this array and remove it. When remove is successful, the method will return 0,
	 * when the counter is equal to 0, it will return -1 which means insert fail.
	 * @param item
	 * @return
	 * @throws InterruptedException
	 */
	public int remove_item(int item) throws InterruptedException {
		if(counter == 0) {
			

			return -1;
		} else {
			for (int i = 0; i < bufferlist.length; i++) {
				if (item == bufferlist[i]) {
					
					bufferlist[i] = Integer.MIN_VALUE;
					counter--;
					table.remove(0);
					

					return 0;
				}
			}
		}
		return -1;
	}
	/**
	 * This method is used to get the first items in array, I used arraylist, when something is inserted the list add that
	 * and something is removed the list remove that, so that keep the first item is the array first.
	 * @return
	 */
	public int getItem() {
		try {
			return table.get(0).intValue();
		} catch(Exception e) {
			return Integer.MAX_VALUE;
		}
		
	}
}

