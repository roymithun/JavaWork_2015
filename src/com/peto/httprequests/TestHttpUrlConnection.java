package com.peto.httprequests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestHttpUrlConnection {

	public static void main(String[] args) {
		makeRequest();
	}

	static void makeRequest() {
		try {
			URL url = new URL("http://www.thomas-bayer.com/sqlrest/CUSTOMER/");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String s = null;
			while ((s = br.readLine()) != null) {
				sb.append(s);
				sb.append("\n");
			}
			System.out.println("RESPONSE == " + sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
