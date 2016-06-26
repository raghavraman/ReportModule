package com.example.confrencescreen;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MessageActivity extends TabActivity {

	private TabHost tab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tablayout_videocall);
	
		
		addTab("Sent ",getResources().getDrawable(R.drawable.tab_message_sent_icon),	MessagesSentActivity.class);
		addTab("Received",getResources().getDrawable(R.drawable.tab_message_received_icon),	MessageRecivedActivity.class);
		
		
        
      
	}
	
	
	private void addTab(String name, Drawable drawableId, Class<?> c) {
		tab = getTabHost();		
		//tab.getTabWidget().setDividerDrawable(R.drawable.divider);
	
		TabHost.TabSpec spec = tab.newTabSpec("tab"+name);
//		View TabIndicator = LayoutInflater.from(this).inflate(R.layout.tab_layout, getTabWidget(), false);
//		TextView tv=(TextView)TabIndicator.findViewById(R.id.tabtextview);
//		tv.setText(name);
//		ImageView iv=(ImageView)TabIndicator.findViewById(R.id.tab_imageview);
//		iv.setImageResource(drawableId);
		spec.setIndicator(name, drawableId);
        Intent OrganisedIntent = new Intent(this, c);
        spec.setContent(OrganisedIntent );
        tab.addTab(spec);
		
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.videocall, menu);
		return true;
	}

}
