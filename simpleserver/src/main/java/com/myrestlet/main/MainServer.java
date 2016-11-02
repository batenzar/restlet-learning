package com.myrestlet.main;

import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;

public class MainServer {

	public static void main(String[] args) throws Exception{
		
		Component comp = new Component();
		comp.getServers().add(new Server(Protocol.HTTP, 8111));
		
		Application app = new Application(){
			
			public org.restlet.Restlet createInboundRoot() {
				Router r = new Router();
				r.attach("/",HelloResource.class);
				return r;
			};
		};
		comp.getDefaultHost().attach(app);
		comp.start();
	}
}