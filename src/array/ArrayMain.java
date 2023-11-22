package array;

public class ArrayMain {

	public static void main(String[] args) {
		Array numbers=new Array(3);
		numbers.inser(10);
		numbers.inser(20);
		numbers.inser(30);
	 
		numbers.inser(40);
		numbers.removeAt(4);
		numbers.print();
	}
}
