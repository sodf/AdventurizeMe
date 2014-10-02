package com.example.adventurize_me;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class Sec extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec);
		ImageButton fir1 = (ImageButton)findViewById(R.id.imageButton1);
		fir1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
		        Intent intent = new Intent(Sec.this,ChampaignI.class);
		        startActivity(intent);
		      }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sec, menu);
		return true;
	}

}
