package org.baekjoon_code.b2798;

import java.util.Scanner;

public class b2798 {
	static void black(int a) {
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int Min=M;
		int real=0;
		int arrN[]=new int[N];
		for(int i=0;i<N;i++) {
			arrN[i]=scn.nextInt();
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				for(int z=0;z<N;z++) {
					int sum=0;
					if(i!=j & i!=z & j!=z) {	
					sum+=arrN[i]+arrN[j]+arrN[z];
					if(Min>Math.abs(Math.min(M,sum-M))) {
						Min=Math.abs(Math.min(M,sum-M));
						real=Math.min(M,sum-M);
					}
					}
				}
			}
		}
		System.out.println(real+M);
	}
}
	