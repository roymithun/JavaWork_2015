package com.peto.justdoit;

import java.util.Enumeration;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Map.Entry;
import java.util.Properties;

public class PlayWithJavaSystem {

	public static void main(String[] args) {
		// playEnvMap();
		playProperties();
	}

	static void playEnvMap() {
		Map<String, String> envMap = System.getenv();

		for (Entry<String, String> entry : envMap.entrySet()) {
			System.out.println(entry);
		}

		// System.out.println("" + System.getenv("PATH"));
	}

	static void playProperties() {
		Properties properties = System.getProperties();
		Enumeration<?> enumeration = properties.propertyNames();
		int i = 1;
		try {
			while (enumeration.hasMoreElements()) {
				String key = enumeration.nextElement().toString();
				System.out.println("(" + (i++) + "). = " + key + "(" + System.getProperty(key) + ")");
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

		String s = System.getProperty("sun.boot.library.path");
		System.out.println("s = " + s);
	}
}
