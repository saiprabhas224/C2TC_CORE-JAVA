package com.Ait.stringb;

public class Capacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hello");
		System.out.println(sb.capacity());
		sb.append("my name is shasana");
		
		

	}

}
