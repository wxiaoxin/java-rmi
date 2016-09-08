package org.rmi.server.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import org.rmi.server.model.User;

public interface IUserService extends Remote {
	
	public User getUser() throws RemoteException;
	
}
