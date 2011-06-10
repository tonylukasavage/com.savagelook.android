package com.savagelook.android;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Lazy {
	public static class Ex {
		public static String getStackTrace(java.lang.Exception e) {
			StringWriter sWriter = new StringWriter();
			e.printStackTrace(new PrintWriter(sWriter));
			return sWriter.getBuffer().toString();
		}
	}
}
