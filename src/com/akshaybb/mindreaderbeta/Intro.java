package com.akshaybb.mindreaderbeta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.akshaybb.mindreaderbeta.R;
import com.apperhand.device.android.AndroidSDKProvider;
import com.startapp.android.publish.StartAppAd;
public class Intro extends Activity
{
	private StartAppAd startAppAd = null;
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		
	}

	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		AndroidSDKProvider.initSDK(this);//adds
		
		getWindow().setBackgroundDrawableResource(R.drawable.mr);
		
		Thread change= new Thread()
		{
		 public void run()
		 {
			 try
				{
					sleep(2000);
					
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
					
				}
				finally
				{
					Intent sta2= new Intent("com.akshaybb.mindreaderbeta.Reader");
					startActivity(sta2);
					
				}
			
				
				
			}
		
		};
		change.start();
		
	}
	
	
	
	

}
