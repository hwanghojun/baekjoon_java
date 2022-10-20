package org.baekjoon_code.b1300;

import java.util.Scanner;

public class b1300_new {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int k = scn.nextInt();
		
		int left=1;
		int right=k-1;
		while(left<right) {
			int count=0;
			int mid=(left+right)/2;
			for(int i=1;i<N;i++) {
					count += Math.min(mid/i,N);
				}
			if(k<count) {
				right=mid;
			}else {
				left=mid+1;
			}
		}
		
		System.out.println(left);
	}
}
