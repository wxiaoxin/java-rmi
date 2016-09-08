package org.rmi.server.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.rmi.server.model.User;
import org.rmi.server.service.IUserService;

public class UserService extends UnicastRemoteObject implements IUserService {

	private static final long serialVersionUID = 7378446189087753217L;

	public UserService() throws RemoteException {
		super();
	}

	public User getUser() throws RemoteException {
		User user = new User();
		user.setName("admin");
		user.setPassword("123456");
		return user;
	}

}
