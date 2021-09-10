package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {

	public static void main(String[] args) throws Exception{
		Socket sock = new Socket("192.168.219.102", 12345);
		
		System.out.println("연결 완료");
		
		InputStream is = sock.getInputStream();
		DataInputStream di = new DataInputStream(is);
		
		String s = di.readUTF();
		
		System.out.println("서버에게 받은 데이터 : " + s);
		
		di.close();
		is.close();
		sock.close();
	
	}

}
