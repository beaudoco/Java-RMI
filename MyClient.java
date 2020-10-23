import java.rmi.*;
import java.io.*;
import java.util.Scanner;

public class MyClient{

	public static void main(String args[]){
		try{
			System.out.println("Please give a server IP address");
			Scanner in = new Scanner(System.in);
			String s = in.nextLine();

			Method stub=(Method)Naming.lookup("rmi://localhost:5000/lab6");
			//Method stub=(Method)Naming.lookup("rmi://" + s + ":5000/lab6");

			boolean hasValue = true;
			while(hasValue) {
				String msg = in.nextLine();
				hasValue = !msg.isEmpty();

				if (hasValue) {
					System.out.println(stub.action(msg));
				}
			}


		}catch(Exception e){System.out.println(e);}
	}
}
