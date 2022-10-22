package org.baekjoon_code.b2798;

import java.util.Scanner;

public class b2798_new {
	static void black(int a) {
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int tmp=0;;
		int sum=0;
		int arrN[]=new int[N];
		for(int i=0;i<N;i++) {
			arrN[i]=scn.nextInt();
		}
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				for(int z=j+1;z<N;z++) {
					if(i!=j && i!=z && j!=z) {	
					sum=arrN[i]+arrN[j]+arrN[z];
					if(tmp<sum && sum<=M) {
						tmp=sum;
					}
					}
				}
			}
		}
		System.out.println(tmp);
	}
}
	