package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEvenOdd {

	public static void main(String[] args) {
getSepareateEvenOdd();
	}

	private static void getSepareateEvenOdd() {
		List<Integer> listOfNumber = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Map<Boolean, List<Integer>> evenOddMap = listOfNumber.stream().collect(Collectors.partitioningBy(i->i%2==0));
		System.out.println(evenOddMap);
	}
} 
