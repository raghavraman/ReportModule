package com.example.confrencescreen;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MessageRecivedActivity extends Activity {

	
	private ArrayList<DataHolderMessage> mReport=new ArrayList<DataHolderMessage>();
	private ListView listview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.message_received_layout);
		
		listview=(ListView)findViewById(R.id.listView1);
		addDetails();
		 final ListAdapterMessage listAdapterMessage=new ListAdapterMessage(this, mReport);
			listview.setAdapter(listAdapterMessage);
//		
	}
	public void addDetails()
	{
		DataHolderMessage ca = new DataHolderMessage();
		ca.setString("+9994792608 Raghav	(80)");
		mReport.add(ca);
		DataHolderMessage c1 = new DataHolderMessage();
		c1.setString("+9994745458 Vignesh	(47)");
		mReport.add(c1);
		DataHolderMessage c2 = new DataHolderMessage();
		c2.setString("+994792718 Ragul	(82)");
		mReport.add(c2);
		DataHolderMessage c3 = new DataHolderMessage();
		c3.setString("+9994894568 Ramesh	(89)");
		mReport.add(c3);
		DataHolderMessage c4 = new DataHolderMessage();
		c4.setString("+9994792608 Raghav (89)");
		mReport.add(c4);
		DataHolderMessage c5 = new DataHolderMessage();
		c5.setString("+9994745458 Vignesh	(56)");
		mReport.add(c5);
		DataHolderMessage c6 = new DataHolderMessage();
		c6.setString("+994792718 Ragul	(89)");
		mReport.add(c6);
		DataHolderMessage c7= new DataHolderMessage();
		c7.setString("+9994894568 Ramesh	(78)");
		mReport.add(c7);
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.messages_sent, menu);
		return true;
	}
}
