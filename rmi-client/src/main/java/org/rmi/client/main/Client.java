package org.rmi.client.main;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.rmi.server.service.IUserService;

public class Client {

	public static void main(String[] args) {
		
		try {
			// 注册器
			Registry registry = LocateRegistry.getRegistry("localhost", 2016);
			// 调用服务端的UserService服务
			IUserService userService = (IUserService)registry.lookup("userService");
			// 获取执行结果
			System.err.println("调用服务端的执行结果是：" + userService.getUser().getName() + "  " + userService.getUser().getPassword());
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
