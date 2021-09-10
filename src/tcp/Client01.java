package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) throws Exception {
		// 서버와 접속 시도
		Socket sock = new Socket("192.168.219.102", 12345);
		
		OutputStream out = sock.getOutputStream();
		
		System.out.println("수 입력");
		int num = new Scanner(System.in).nextInt();
		out.write(num);
		
		out.close();
		sock.close();
	}
}
