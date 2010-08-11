package com.geosoft.utils;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;


public class SocketCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Socket ...");
		Socket MyClient;
	    try {
	    	   System.out.println("Opening a Client Connection ...");
	           MyClient = new Socket("10.2.2.51", 3389);
	    }
	    catch (IOException e) {
	        System.out.println(e);
	    }

	    ServerSocket MyService=null;
	    try {
	        System.out.println("Opening a Server Connection ...");
	        MyService = new ServerSocket(49200);
	        }
	    catch (IOException e) {
	           System.out.println(e);
	    }

	    try {
	        System.out.println("Server Socket Listening for Connections ...");
	        Socket serviceSocket = MyService.accept();
	        int port  = serviceSocket.getLocalPort();
	        InetAddress  socketAddress = serviceSocket.getInetAddress();
	        String  socketHostAddress = socketAddress.getHostAddress();
	        //String  socketRemoteHostAddress = socketAddress.;
	        System.out.println("Client Established a Connection on Port "+ port + ""+socketHostAddress);
	        SocketAddress sAddr = serviceSocket.getRemoteSocketAddress();
	        System.out.println("Client Connected from "+sAddr);

	     }
	     catch (IOException e) {
	        System.out.println(e);
	     }

	}

}
