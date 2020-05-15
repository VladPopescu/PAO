package com.pao.test.socket_part1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSocketExample {

	public static void main(String [] args) throws IOException {

		Socket socket = new Socket("localhost", 4325);

		ServerSocket serverSocket = new ServerSocket(4325);
		serverSocket.accept();

		socket.close();
		serverSocket.close();
	}
}
