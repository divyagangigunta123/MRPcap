package com.calsoft.size;

public class CountSize {

	public static void main(String[] args) {
		
		String server_ip = "{ server_ip : 999.999.999.999, src_port : 1234567, dest_port : 999.999.999.999, bytes_transferred : 456456456, total_traffic :456456456}";
		int size = server_ip.length();
		Long val = 0l;
		
		System.out.println(size);
		for (int i = 0; i < 10000; i++) {
			val +=size;
			System.out.println(val);
		}
	

	}

}
