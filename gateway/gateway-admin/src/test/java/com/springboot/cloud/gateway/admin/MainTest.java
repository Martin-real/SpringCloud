package com.springboot.cloud.gateway.admin;

import java.util.Arrays;

/**
 * @description:
 * @author: zhaoyangMA
 * @create: 2021-05-22 19:08
 **/
public class MainTest {

	public static void main(String[] args) {
		int data [] = {0,0,1,1,1,2,2,3,3,4};
		int [] nums = {5,0,1,1,1,2,2,3,3,4};
		/*for (int num : nums) {
			System.out.println(num);
		}*/
		int i = removeDuplicates(nums);
		System.out.println(i);
	}


	public static int removeDuplicates(int[] A) {
		//边界条件判断
		if (A == null || A.length == 0)
			return 0;
		int left = 0;
		for (int right = 1; right < A.length; right++)
			//如果左指针和右指针指向的值一样，说明有重复的，
			//这个时候，左指针不动，右指针继续往右移。如果他俩
			//指向的值不一样就把右指针指向的值往前挪
			if (A[left] != A[right]){
				A[++left] = A[right];
//				System.out.println(A[left]);
			}

		Arrays.stream(A).forEach(a-> System.out.println(a));
		return ++left;
	}
}
