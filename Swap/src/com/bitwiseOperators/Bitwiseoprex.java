package com.bitwiseOperators;

public class Bitwiseoprex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=5, c=20;
	
		System.out.println(a<b && b<c);
		System.out.println(a<b & a<c);
		System.out.println(a<b && ++a<c);
		System.out.println(a);
		System.out.println(a<b & a++<b);
		System.out.println(a);

	}

}
