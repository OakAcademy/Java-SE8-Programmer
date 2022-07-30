package array;

import java.util.Arrays;

public class MultiDArrays {

	public static void main(String[] args) {
		
		//2D arrays
		
		int[][] nums = new int[2][3];//2 rows and 3 columns - 2 arrays with 3 elements - total element=6(2*3)
		nums[0][0] = 1;
		nums[0][1] = 3;
		nums[0][2] = 5;
		nums[1][0] = 7;
		nums[1][1] = 9;
		nums[1][2] = 11;
		
		System.out.println(Arrays.toString(nums[0]));
		System.out.println(Arrays.toString(nums[1]));
		
		int[] nums2[] = {
			
				{2, 4, 6},
				{8, 10, 12}
				
		};
		
		System.out.println(Arrays.toString(nums2[0]));
		System.out.println(Arrays.toString(nums2[1]));
		
		
		//3D Arrays
		int nums3[][][] = {
				
				{
					{10,30,50},
					{70,90,110}
				},
				{
					{20,40,60},
					{80,100,120}
				}
				
		};
		
		System.out.println(Arrays.toString(nums3[0][0]));
		System.out.println(Arrays.toString(nums3[0][1]));
		System.out.println(Arrays.toString(nums3[1][0]));
		System.out.println(Arrays.toString(nums3[1][1]));
		

	}

}
