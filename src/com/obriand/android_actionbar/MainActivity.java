package com.obriand.android_actionbar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
	
	public final static String TAG = "com.obriand.android_actionbar.MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(TAG,"onCreate MainActivity");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case android.R.id.home:
	        	Log.i(TAG,"onCreate");
	            return true;
	        case R.id.menu_settings:
	        	Log.i(TAG,"settings");
	            return true;
	        case R.id.menu_secondactivity:
	        	Log.i(TAG,"second activity");
	        	Intent i = new Intent(this, SecondActivity.class);
	        	this.startActivity(i);
	            return true;
	        case R.id.menu_about:
	        	Log.i(TAG,"about");
	            return true;	            
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
}
