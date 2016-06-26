package com.example.confrencescreen ;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class ConferenceActivity extends TabActivity {

	private TabHost tab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tablayout_conference);
		
		 
		
	
	
		addTab("Organised",getResources().getDrawable(R.drawable.tab_conference_org_icon),	ConferenceOrganisedActivity.class);
		addTab("Attended", getResources().getDrawable(R.drawable.tab_conference_att_icon),	ConferenceAttendedActivity.class);
      
		
		
	}
	
	private void addTab(String name, Drawable drawable, Class<?> c) {
		tab = getTabHost();		
		TabHost.TabSpec spec = tab.newTabSpec("tab"+name);
		spec.setIndicator(name, drawable);
        Intent OrganisedIntent = new Intent(this, c);
        spec.setContent(OrganisedIntent );
        tab.addTab(spec);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
