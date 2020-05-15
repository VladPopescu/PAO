package com.pao.test.socket_part1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SimpleClient {
	public static void main(String[] args) throws IOException {
			Socket s = new Socket("localhost", 6666);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server");
			dout.flush();
			dout.close();
			s.close();
	}
}
