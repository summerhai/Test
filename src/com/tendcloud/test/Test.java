package com.tendcloud.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
	public static void main(String[] args) throws UnknownHostException {
		System.out.println("test");
		InetAddress addr = InetAddress.getLocalHost();
		String ip=addr.getHostAddress().toString();
		String address=addr.getHostName().toString();
		System.out.println(ip+","+address);
	}
}
