package com.classes;

import java.net.MalformedURLException;
import java.net.URL;

import com.api.io.Scanner;
import com.api.logger.Log;

public class ClassURL {

	URL url;
	String protocol, file, host, path, query, ref, externalForm, authority, userInfo;
	int port, defaultPort;

	public ClassURL() {

		String urlStr = Scanner.nextLine();

		try {
			url = new URL(urlStr);
		} catch (MalformedURLException e) {
			Log.info("Malformed URL Found");
		}

		protocol = url.getProtocol();
		file = url.getFile();
		host = url.getHost();
		path = url.getPath();
		port = url.getPort();
		query = url.getQuery();
		ref = url.getRef();
		externalForm = url.toExternalForm();
		authority = url.getAuthority();
		defaultPort = url.getDefaultPort();
		userInfo = url.getUserInfo();

	}
}
