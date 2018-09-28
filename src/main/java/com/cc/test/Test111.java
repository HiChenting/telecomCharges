package com.cc.test;

public class Test111 {
	static int temp;
	public static void main (String[] args){
		int a[] = {2,4,1,6,8};
		for(int i = 0; i < a.length-1; i++){
			for(int j = 0; j < a.length-1-i; j++ ){
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int m = 0; m < a.length; m++ ){
			System.out.print(a[m]);
		}
	}
}