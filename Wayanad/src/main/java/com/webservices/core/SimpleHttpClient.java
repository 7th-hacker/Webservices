package com.webservices.core;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.api.io.Scanner;
import com.api.logger.Log;

/**
 * @author 7th_hacker
 *         <p>
 *         This class show the use of HTTP as an API for the web-service
 *         development
 *         </p>
 */
public class SimpleHttpClient {
	
	public void httpAsAPI() {

		String urlStr = Scanner.nextLine();
		
		try {
		
			URL url = new URL(urlStr);
			Log.info("URL: "+url);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
}