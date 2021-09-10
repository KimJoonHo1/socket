package tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client03_1 {
	public static void main(String[] args) throws Exception{
		Socket sock = new Socket("192.168.219.102", 12345);
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		System.out.println("전송 데이터 입력");
		String s = new Scanner(System.in).next();
		
		dos.writeUTF(s);
		System.out.println("전송 완료");
		
		dos.close();
		out.close();
		sock.close();
	}
}
