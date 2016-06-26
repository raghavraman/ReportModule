package com.example.confrencescreen;

import com.example.confrencescreen.R.color;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		TabHost tab = getTabHost();
		
		TabSpec VoiceCall = tab.newTabSpec("VoceCall");
		VoiceCall.setIndicator("VoiceCall", getResources().getDrawable(R.drawable.voicecall_header_icon));
        Intent VoiceCallIntent = new Intent(this,VoicecallActivity.class);
        VoiceCall.setContent(VoiceCallIntent );
        
        
        TabSpec VideoCall = tab.newTabSpec("VideoCall");
		VideoCall.setIndicator("VideoCall", getResources().getDrawable(R.drawable.videocall_header_icon));
        Intent VideoCallIntent = new Intent(this,VideocallActivity.class);
        VideoCall.setContent(VideoCallIntent );
        
        TabSpec Conference = tab.newTabSpec("Conference");
		Conference.setIndicator("Conference", getResources().getDrawable(R.drawable.conference_header_icon));
        Intent ConferenceIntent = new Intent(this, ConferenceActivity.class);
        Conference.setContent(ConferenceIntent );
        
        TabSpec Message = tab.newTabSpec("Message");
		Message.setIndicator("Message", getResources().getDrawable(R.drawable.message_header_icon));
        Intent MessageIntent = new Intent(this, MessageActivity.class);
        Message.setContent(MessageIntent );
        
        
        tab.addTab(VoiceCall);
        tab.addTab(VideoCall);
        tab.addTab(Conference);
        tab.addTab(Message);
	}
        

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
//	public void onConference(View view){
//		Intent confrence=new Intent(this,ConferenceActivity.class);
//		startActivity(confrence);
//		
//		
//	}
//	public void onVideocall(View view){
//		
//		Intent videocall = new Intent(this, VideocallActivity.class);
//		startActivity(videocall);
//		
//	}
//	public void onVoicecall(View view){
//		Intent voicecall = new Intent(this, VoicecallActivity.class);
//		startActivity(voicecall);
//		
//		
//	}
//	public void onChat(View view){
//		
//	
//	}
}
