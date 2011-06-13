package com.savagelook.android;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class JsonSpinner extends Spinner {
	private static final String NAMESPACE = "http://schemas.android.com/apk/lib/com.savagelook.android";
	private String keyString, valueString;
	
	public JsonSpinner(Context context) {
		super(context);
	}
	
	public JsonSpinner(Context context, AttributeSet attrs) throws JSONException, IOException {
		super(context, attrs);
		this.init(context, attrs);
	}

	public JsonSpinner(Context context, AttributeSet attrs, int mode) throws JSONException, IOException {
		super(context, attrs, mode);
		this.init(context, attrs);
	}
	
	private void init(Context context, AttributeSet attrs) throws JSONException, IOException {
		this.keyString = attrs.getAttributeValue(JsonSpinner.NAMESPACE, "json_key");
		if (this.keyString == null) this.keyString = "k";
		this.valueString = attrs.getAttributeValue(JsonSpinner.NAMESPACE, "json_value");
		if (this.valueString == null) this.valueString = "v";
		
		int jsonArrayResourceId = attrs.getAttributeResourceValue(JsonSpinner.NAMESPACE, "json_resource", 0);
		if (jsonArrayResourceId != 0) {
			this.populate(jsonArrayResourceId);	
		}
	}
	
	// I use this to load JSON from res/raw
	public void populate(int jsonArrayResourceId) throws JSONException, IOException {
		this.populate(JsonHelper.getJsonArrayFromResource(this.getContext(), jsonArrayResourceId));
	}
	
	// The key and value for the JSONArray must be "k" and "v" respectively
	public void populate(JSONArray jsonArray) throws JSONException {
        ArrayAdapter<KeyValuePair<String,String>> adapter = new ArrayAdapter<KeyValuePair<String,String>>(this.getContext(), android.R.layout.simple_spinner_item);
	    	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.setAdapter(adapter);	
        
        adapter.clear();
        for (int i = 0; i < jsonArray.length(); i++) {
		    	JSONObject pair = jsonArray.getJSONObject(i);
		    adapter.add(new KeyValuePair<String,String>(pair.getString(this.keyString), pair.getString(this.valueString)));
	    }
	}
}
