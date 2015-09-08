package com.akshaybb.mindreaderbeta;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.akshaybb.mindreaderbeta.R;
import com.apperhand.device.android.AndroidSDKProvider;
import com.startapp.android.publish.StartAppAd;

public class Reader extends Activity implements OnClickListener 
{
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if(startAppAd == null) {
			startAppAd = new StartAppAd(this); startAppAd.load();
			}
	}


	private StartAppAd startAppAd = null;

	Button b1;
	TextView tvh,tvs;
	int c=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidSDKProvider.initSDK(this);
		setContentView(R.layout.rea);
		
		intial();
		b1.setOnClickListener(this);
		
		//getWindow().setBackgroundDrawableResource(R.drawable.choose3);
		//RelativeLayout layout=(RelativeLayout)findViewById(R.id.readerC);
		//layout.setBackgroundResource(R.drawable.in1);
	}

	private void intial() {
		// TODO Auto-generated method stub
		b1=(Button)findViewById(R.id.button1);
		tvh=(TextView)findViewById(R.id.tvRHead);
		tvs=(TextView)findViewById(R.id.tvRSub);
		
		
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
		case R.id.button1:
		  {
			  c++;
			  page(c);
		  }
		
		}
	}

	private void page(int c2) {
		// TODO Auto-generated method stub
		switch(c2)
		{
		case 1:
			tvh.setTextSize(26);
			tvh.setText("Choose a number between 10 to 60 ! \n");
			tvs.setText("");
			break;
		case 2:
			tvh.setTextSize(24);
			tvh.setText("Now subtract it from its reverse \n Eg. \n  If 19 then 19-91 ! \n If answer comes b/w 1-36 then continue \n  else \n try again !");
		break;
		default:
			Intent akshay= new Intent("com.akshaybb.mindreaderbeta.Select");
			startActivity(akshay);
			finish();
		}
	}

	private void createButton() {
		// TODO Auto-generated method stub
		Button b2=new Button(this);
		Button b3=new Button(this);
		Button b4=new Button(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
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
			if(startAppAd != null) {
				startAppAd.show();
				startAppAd = new StartAppAd(this);
				startAppAd.load();
				}
			finish();
			break;
		}
		return false;
		
	}
}
	
	
	

