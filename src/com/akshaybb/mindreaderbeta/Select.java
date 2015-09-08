package com.akshaybb.mindreaderbeta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.akshaybb.mindreaderbeta.R;
import com.startapp.android.publish.StartAppAd;

public class Select extends Activity implements OnClickListener
{
	private StartAppAd startAppAd = null;
	Button b1,b2,b3,b4;
    String s;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select);
		intial();
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
	}

	private void intial() {
		// TODO Auto-generated method stub
		b1=(Button)findViewById(R.id.b1S);
		b2=(Button)findViewById(R.id.b2S);
		b3=(Button)findViewById(R.id.b3S);
		b4=(Button)findViewById(R.id.b4S);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.b1S:s="1";
		break;
		case R.id.b2S:s="2";
		break;
		case R.id.b3S:s="3";
		break;
		case R.id.b4S:s="4";
		break;
		}
		Bundle suitcase=new Bundle();
		suitcase.putString("key_data", s);
		Intent flight=new Intent(Select.this,Symbol.class);
		flight.putExtras(suitcase);
		startActivity(flight);
		finish();
	}
	
	
	/*Settings menu*/
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu)

	{
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater capactiveButtonMenu=getMenuInflater();
	    capactiveButtonMenu.inflate(R.menu.avant_grade_menu, menu);
	    return true;
	    
	}
	
	
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId())
		{
		
		
		case R.id.credits:
			Intent aboutus=new Intent("com.akshaybb.mindreaderbeta.ABOUTUS");
			startActivity(aboutus);
			break;
		
		case R.id.Exit:
			if(startAppAd == null) {
				startAppAd = new StartAppAd(this); startAppAd.load();
				}
			finish();
			break;
		}
		return false;
		
	}
}
