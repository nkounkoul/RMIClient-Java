package app;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import service.IBanqueRemote;

public class ClientRMI {

	public static void main(String[] args) 
	{
		try
		{
			// connexion au registre rmi
			IBanqueRemote stub = (IBanqueRemote) Naming.lookup("rmi://localhost:1234/BK");
			System.out.println(stub.conversion(1250));
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
