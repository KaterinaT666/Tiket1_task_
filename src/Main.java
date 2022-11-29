import java.util.Arrays;

public class Main {
	public static void reverse(int [] nums){
		int [] temp = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			temp[nums.length - 1 - i] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = temp[i];

		}
	}

	public static void main(String[] args) {

		int [] nums = {1,2,3,4,5,6,7,8,9};
		reverse(nums);

		System.out.println(Arrays.toString(nums));

	}
}