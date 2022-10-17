package org.baekjoon_code.b1920;

import java.util.Scanner;
import java.util.Arrays;

public class b1920 {
		private static int N;
	    private static int[] arrN;
	    private static int M;

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		N = scn.nextInt();
		 arrN= new int[N];
		for (int i = 0; i < N; i++) {
			arrN[i] = scn.nextInt();
		}
		Arrays.sort(arrN);
		M = scn.nextInt();
		for (int i = 0; i < M; i++) {
			int m = scn.nextInt();
			int left = 0;
			int right = N - 1;

			while (left <= right) {
				int mid = (left + right) / 2;
				int n = arrN[mid];
				if (n == m) {
					System.out.println("1");
					break;
				}
				if (n < m) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
				if (left > right) {
					System.out.println("0");
					break;
				}

			}
		}
	}

}
