import java.io.*;
import java.net.*;

public class twowaycli{
  	public static void main(String []arg)throws Exception{
	  Socket soc=new Socket("localhost",4000);
	  System.out.println("Server connected");
	  DataInputStream din=new DataInputStream(soc.getInputStream());
    DataOutputStream dout=new DataOutputStream(soc.getOutputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String l1="",l2="";
    while(!l1.equals("over"))
    {
      l1=br.readLine();
      dout.writeUTF(l1);
      l2=din.readUTF();
      System.out.println("Server says:"+l2);
    }  
	}
}