package generics;

import java.util.TreeSet;

public class ComparableTest {
	public static void main(String[] args) {
		 TreeSet<Integer> nums = new TreeSet<>();
		 nums.add(18);
		 nums.add(23);
		 nums.add(3);
		 nums.add(13);
		 nums.add(123);
		 nums.add(7);
		 nums.add(-325);
		 nums.add(2);
		 
		 for(Integer n: nums) {
			 System.out.println(n);
		 }
	}
}
