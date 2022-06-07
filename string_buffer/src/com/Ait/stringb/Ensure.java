package com.Ait.stringb;

public class Ensure {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hello");
		System.out.println(sb.capacity());
		sb.append("my name is shasana");
		System.out.println(sb.capacity());
		sb.ensureCapacity(10);
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
		

	}

}
