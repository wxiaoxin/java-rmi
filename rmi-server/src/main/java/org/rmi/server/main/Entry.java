package org.rmi.server.main;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.rmi.server.service.IUserService;
import org.rmi.server.service.impl.UserService;

public class Entry {

	public static void main(String[] args) {
		
		try {
			// 创建UserService
			IUserService userService = new UserService();
			// 注册表
			Registry registry = LocateRegistry.createRegistry(2016);
			// 将创建的userService绑定到注册表中
			registry.bind("userService", userService);
			
			System.err.println("Server端的IUserService已经启动，等待远程调用..");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
