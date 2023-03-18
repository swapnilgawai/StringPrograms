package com.velocity;

public class B {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Program");
		StringBuilder sb = str.reverse();
		System.out.println(sb);

		System.out.println(" ");

		String st = "Poonam";
		char[] chArr = st.toCharArray();
		for (int i = chArr.length - 1; i >= 0; i--) {
			System.out.print(chArr[i]);
		}
	}
}
