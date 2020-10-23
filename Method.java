import java.rmi.*;
import java.rmi.server.*;

public interface Method extends Remote{

	public String action(String input)throws RemoteException;
}
