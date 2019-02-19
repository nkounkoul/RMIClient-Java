package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import metier.Compte;

public interface IBanqueRemote extends Remote
{
	public double conversion(double mt) throws RemoteException;
	public Compte cunsulterCompte(int code) throws RemoteException;
	

}
