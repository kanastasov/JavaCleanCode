package com.kirilanastasov.srp.demo2;

import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class FileManager {
	
	public void downloadFile(String location) throws IOExceptoin {
		URL website = new URL("http://google.com/");
		ReadableByteChannel readableByteChannel = new Channels.newChannel(website.openStream());
		
	}

}
