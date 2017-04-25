package org.wrh.arrays;

import java.util.Arrays;

public class ArraysDemo01 {

	public static void main(String[] args) {
		int[] i1={1,2,3,4,5,6};
		int[] i2={6,5,4,3,2,1};
		System.out.println(Arrays.equals(i1,i2));
		Arrays.sort(i2);
		System.out.println(Arrays.equals(i1,i2));
		Arrays.fill(i2, 4);
		System.out.println(Arrays.toString(i2));
		
	}

}
