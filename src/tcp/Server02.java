package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server02 {

	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(12345);
		System.out.println("서버 살행...");
		Socket sock = server.accept();
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		System.out.println("수신 대기...");
		
		System.out.print("클라이언트에게 보낼 데이터 : ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		dos.writeUTF(s);
		
		
		dos.close();
		os.close();
		sock.close();
		server.close();
	}

}
