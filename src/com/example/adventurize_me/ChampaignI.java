package com.example.adventurize_me;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ChampaignI extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_champaign_i);
		ImageButton fir = (ImageButton)findViewById(R.id.imageButton2);
		fir.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
		        Intent intent = new Intent(ChampaignI.this,MainActivity10.class);
		        startActivity(intent);
		      }
		});
		ImageButton fir1 = (ImageButton)findViewById(R.id.imageButton3);
		fir1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
		        Intent intent = new Intent(ChampaignI.this,MainActivity20.class);
		        startActivity(intent);
		      }
		});
		ImageButton fir2 = (ImageButton)findViewById(R.id.imageButton1);
		fir2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
		        Intent intent = new Intent(ChampaignI.this,MainActivity03.class);
		        startActivity(intent);
		      }
		});
		ImageButton fir3 = (ImageButton)findViewById(R.id.imageButton4);
		fir3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
		        Intent intent = new Intent(ChampaignI.this,MainActivity00.class);
		        startActivity(intent);
		      }
			
		});
		Button fir7 = (Button)findViewById(R.id.button1);
		fir7.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
		        Intent intent = new Intent(ChampaignI.this,Review.class);
		        startActivity(intent);
		      }
		});
		Button fir8 = (Button)findViewById(R.id.Button01);
		fir8.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
		        Intent intent = new Intent(ChampaignI.this,Preparations.class);
		        startActivity(intent);
		      }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.champaign_i, menu);
		return true;
	}

}
