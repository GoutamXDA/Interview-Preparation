package array;

public class Array {

	private int[] items;
	private int count;

	public Array(int length) {
		items = new int[length];
	}
// to add elements
	
	public void inser(int item) {
		// check does an array is full
		if (items.length == count) {
			// when full double the size
			int[] newItems = new int[count * 2];
			for (int i = 0; i < count; i++)
				// add the elements to newly double sized array
				newItems[i] = items[i];
			items = newItems;

		}
		//
		items[count++] = item;

	}

	public void removeAt(int index) {
		if (index < 0 || index >= count)
			throw new IllegalArgumentException();

		for (int i = index; i < count - 1; i++) {
			items[i] = items[i + 1];
		}
		count--;
	}

	public int indexOf(int item) {
		for (int i = 00; i < count; i++)
			if (items[i] == item)
				return i;
		return -1;

	}
	public void print() {
		for (int i = 0; i < count - 1; i++) {
			System.out.println(items[i]);
		}
	}

}
