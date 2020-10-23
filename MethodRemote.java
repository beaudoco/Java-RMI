import java.rmi.*;
import java.rmi.server.*;
import java.time.LocalDateTime;
import java.util.Date;

public class MethodRemote extends UnicastRemoteObject implements Method{

	MethodRemote()throws RemoteException{
		super();
	}

	public String action(String input){
		String tmpString = "";

		if (!input.isEmpty()) {
			if (input.toLowerCase().equals("time")) {
				tmpString = LocalDateTime.now() + "\r\n";
			} else {
				tmpString = input.toUpperCase();
			}
		}

		return tmpString;
	}
}
