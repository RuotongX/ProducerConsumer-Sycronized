package producerConsumer;
import java.util.ArrayList;

public class Buffer {
	int[] bufferlist;
	public static final int BUFFER_SIZE = 10;
	int counter = 0;
	ArrayList table = new ArrayList();
	public Buffer() {
		bufferlist = new int[BUFFER_SIZE];
		for(int i = 0;i<BUFFER_SIZE;i++) {
			bufferlist[i] = Integer.MIN_VALUE;
		}
	}
	public int insert_item(int item) {
		if(counter == BUFFER_SIZE) {
			return -1;
		} else {
			for(int i=0;i<bufferlist.length;i++) {
				if(bufferlist[i] ==Integer.MIN_VALUE) {
					bufferlist[i] = item;
					counter++;
					table.add(item);
					return 1;
				} 
			}
		return 1;
		}
	}
	public int remove_item(int item) {
		for(int i=0;i<bufferlist.length;i++) {
			if(item == bufferlist[i]) {
				bufferlist[i] = Integer.MIN_VALUE;
				counter --;
			    table.remove(0);
				return 1;
			}
		}
		return -1;
	}
	public int getItem() {
		try {
			return (int) table.get(0);
		} catch(Exception e){
			return Integer.MAX_VALUE;
		}
	}
}

