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

public class Symbol extends Activity implements OnClickListener {
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if(startAppAd == null) {
			startAppAd = new StartAppAd(this); startAppAd.load();
			}
	}


	Button b1;
	private StartAppAd startAppAd = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.symbol);
		  selectBg();
		  b1=(Button)findViewById(R.id.bSymbol);
		  b1.setOnClickListener(this);
	
	}

	private void selectBg() {
		// TODO Auto-generated method stub
		Bundle suitcase=getIntent().getExtras();
		  String s=suitcase.getString("key_data");
		  char[] ch=s.toCharArray();
		  String img="R.drawable.sym"+s;
		  switch(ch[0])
		  {
		  case '1':
			  getWindow().setBackgroundDrawableResource(R.drawable.sym1); 
			  break;
		  case '2':
			  getWindow().setBackgroundDrawableResource(R.drawable.sym2); 
			  break;
		  case '3':
			  getWindow().setBackgroundDrawableResource(R.drawable.sym3); 
			  break;
		  case '4':
			  getWindow().setBackgroundDrawableResource(R.drawable.sym4); 
			  break;
			  
		  }
		
		  
		
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Bundle suitcase=getIntent().getExtras();
		  String s=suitcase.getString("key_data");
		Bundle suitcase2=new Bundle();
		suitcase2.putString("key_data", s);
		Intent flight=new Intent(Symbol.this,Final.class);
		flight.putExtras(suitcase2);
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
