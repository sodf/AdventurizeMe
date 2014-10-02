package com.example.adventurize_me;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity20 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity20);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity20, menu);
		return true;
	}

}
