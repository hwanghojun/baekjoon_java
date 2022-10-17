package org.baekjoon_code.b10815;

import java.util.Scanner;
import java.util.Arrays;

public class b10815 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int arr_num[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr_num[i] = scn.nextInt();
		}
		Arrays.sort(arr_num);
		int M = scn.nextInt();
		int arr_check[] = new int[M];
		int arr_result[] = new int[M];
		for (int i = 0; i < M; i++) {
			arr_check[i] = scn.nextInt();
			for (int j = 0; j < N; j++) {
				if(arr_check[i]<arr_num[j])break;
				else if (arr_check[i] == arr_num[j]) {
					arr_result[i] = 1;
				}
			}
		}
		for (int var : arr_result) {
			System.out.print(var + " ");
		}
	}
}
