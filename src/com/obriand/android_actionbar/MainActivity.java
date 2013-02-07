package com.obriand.android_actionbar;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView.AdapterContextMenuInfo;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
	    AdapterContextMenuInfo info = (AdapterContextMenuInfo) item.getMenuInfo();
	    switch (item.getItemId()) {
	        case R.id.menu_settings:
	            Log.i("actionbar:main:","settings");
	            return true;
	        case R.id.menu_secondactivity:
	        	Log.i("actionbar:main:","secondactivity");
	            return true;
	        case R.id.menu_about:
	        	Log.i("actionbar:main:","about");
	            return true;
	        default:
	            return super.onContextItemSelected(item);
	    }
	}

}
