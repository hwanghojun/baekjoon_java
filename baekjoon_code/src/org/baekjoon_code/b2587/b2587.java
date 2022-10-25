package org.baekjoon_code.b2587;

import java.util.Scanner;
import java.util.Arrays;
public class b2587 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arrN[]=new int[5];
		int sum=0;
		for(int i=0;i<5;i++) {
			arrN[i]=scn.nextInt();
			sum+=arrN[i];
		}
		Arrays.sort(arrN);
		System.out.println(sum/5);
		System.out.println(arrN[2]);
	}

}
