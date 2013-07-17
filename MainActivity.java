package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.util.Log;
//import com.android.internal.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		Log.d("vicky", "s: " + getString(com.android.internal.R.string.immediatenote_app_name));
        Log.d("vicky", "s: " + getString(R.string.hello_world));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
