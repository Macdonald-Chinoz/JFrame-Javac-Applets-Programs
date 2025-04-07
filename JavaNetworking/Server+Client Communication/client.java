import java.net.*;
import java.io.*;

public class client{
	public static void main(String[] args) throws IOException{
		Socket s=new Socket("localhost", 4999);//until this point=simple client+server connection
		
		//one commnication=sending data from client to server
		PrintWriter pr=new PrintWriter(s.getOutputStream());
		pr.println("hello");
		pr.flush();
	}
	}