package com.savagelook.android;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class Toaster {
	public static int durationDefault = Toast.LENGTH_SHORT;
	
	public static void toast(Context context, String message, View view, int duration) {		
		Toast toast = ToastSingleton.getInstance(context);
		toast.cancel();
		toast.setDuration(duration);
		if (message != null) toast.setText(message);
		if (view != null) toast.setView(view);
		toast.show();	
	}
	
	// Toast layout overloads
	public static void toast(Context context, View view, int duration) {
		toast(context, null, view, duration);	
	}
	
	public static void toast(Context context, View view) {
		toast(context, view, durationDefault); 	
	}
	
	// Toast plain message overloads
	public static void toast(Context context, String message, int duration) {
		toast(context, message, null, duration);
	}
	
	public static void toast(Context context, int messageResourceId, int duration) {
		toast(context, context.getString(messageResourceId), duration);	
	}
	
	public static void toast(Context context, String message) {
		toast(context, message, durationDefault);	
	}
	
	public static void toast(Context context, int messageResourceId) {
		toast(context, context.getString(messageResourceId));	
	}
}