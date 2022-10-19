package org.baekjoon_code.b1300;

import java.util.Scanner;
import java.util.Arrays;

public class b1300 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int B[] =new int[N*N];
		int k = scn.nextInt();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				B[i*j+j]=(i+1)*(j+1);
			}
		}
		Arrays.sort(B);
		System.out.println(B[k]);
	}
}
