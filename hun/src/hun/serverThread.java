package hun;

import java.io.*;
import java.net.*;

public class serverThread implements Runnable {
	public void run(){
		try {    
		    ServerSocket serverSocket = new ServerSocket(8080);
		    while(true){
				Socket insocket = serverSocket.accept( );
					
				BufferedReader in = new BufferedReader (new InputStreamReader(insocket.getInputStream()));
				//PrintWriter pOut = new PrintWriter (insocket.getOutputStream(), true);
			
			    String instring = in.readLine();//Ŭ���̾�Ʈ�� ���� ����
			    System.out.println("dd");
			    //out.println("get this: " + instring);
			    //pOut.println("The server got this: " + instring);//Ŭ���̾�Ʈ�� ����
			    insocket.close();
			}
		}
		catch (Exception e) {} 
	}
}
