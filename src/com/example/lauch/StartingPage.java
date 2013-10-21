package com.example.lauch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingPage extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.starting_page);
		
		Button btnReg = (Button) findViewById(R.id.btnReg);
		btnReg.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				startActivity(new Intent(getBaseContext(), MainActivity.class));
			}
		});
		
		Button btnUnReg = (Button) findViewById(R.id.btnUnreg);
		btnUnReg.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				startActivity(new Intent(getBaseContext(), MainActivity.class));
			}
		});
		
	}
}
