package com.myrestlet.main;

import org.restlet.Server;
import org.restlet.data.Protocol;

public class MainServer {

	public static void main(String[] args) throws Exception{
		Server app = new Server(Protocol.HTTP);
		app.start();
	}
}
