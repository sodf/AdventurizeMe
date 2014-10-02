package com.example.adventurize_me;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Select extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select);
		//ImageButton fir1 = (ImageButton)findViewById(R.id.imageButton1);
		Button btn=(Button)findViewById(R.id.btnSubmit);
		btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
		        Intent intent = new Intent(Select.this,Sec.class);
		        startActivity(intent);
		      }
		});
		Button fir7 = (Button)findViewById(R.id.btnPrep);
		fir7.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
		        Intent intent = new Intent(Select.this,Preparations.class);
		        startActivity(intent);
		      }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select, menu);
		return true;
	}

}
