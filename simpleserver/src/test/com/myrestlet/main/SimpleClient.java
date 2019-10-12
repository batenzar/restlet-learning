package com.myrestlet.main;

import java.io.IOException;

import org.junit.Test;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

public class SimpleClient {

	@Test
	public void helloWorldServiceTest() throws IOException {
		ClientResource client = new ClientResource("http://localhost:8111");

		try {
			Representation representation = client.get();
			String text = representation.getText();
			System.out.println("Response -> " + text);
		} finally {
			client.release();
		}

	}
}
