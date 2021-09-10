package tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) throws Exception {
		// 자기자신의 아이피와 포트로 서버로 구동
		// 포트 : 2byte 크기를 가지고 있으며, 특정 프로그램을 구분 지어준다
		// 2byte : 0 ~ 65535
		// 서버 : 서비스를 제공하는 컴퓨터
		// 클라이언트 : 서비스를 제공받는 컴퓨터
		ServerSocket server = new ServerSocket(12345);
		System.out.println("접속 대기합니다");
		Socket sock = server.accept(); // 클라이언트와 연결 대기
		System.out.println("접속 되었습니다");
		// System.out.println(sock.getInetAddress()); 클라이언트의 IP 주소
		
		InputStream is = sock.getInputStream(); // 클라이언트와 연결된 스트림
		System.out.println("수신 데이터 : " + is.read());
		
		is.close();
		sock.close();
	}
}
