package com.calsoft.size;

public class ConvertInt {
	
	
	public static void main(String[] args) {
		byte[] data = new byte[] {65, 0, 44, 0};
	
		int target = ((data[3] & 0xFF) << 24) | ((data[2] & 0xFF) << 16)
				| ((data[1] & 0xFF) << 8) | (data[0] & 0xFF);
		
		System.out.println(target);
	}
		
}	