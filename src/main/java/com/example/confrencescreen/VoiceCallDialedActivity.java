package com.example.confrencescreen;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class VoiceCallDialedActivity extends Activity {


	private ArrayList<DataHolder> vReport = new ArrayList<DataHolder>();
	private ListView listview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.voicecall_dialed_layout);
		
		listview = (ListView)findViewById(R.id.listView1);
		
		 addDetails();
		
		
		final ListAdapter listadapter=new ListAdapter(this, vReport);
		listview.setAdapter(listadapter);
		
	}
	
	public void addDetails()
	{
		DataHolder ca = new DataHolder();
		ca.setName("+9994792608 Raghav");
		ca.setTime("11/09/1994 12.00pm 0.53h");
		vReport.add(ca);
		DataHolder c1 = new DataHolder();
		c1.setName("+9994745458 Vignesh");
		c1.setTime("11/08/1994 12.00pm 0.53h");
		vReport.add(c1);
		DataHolder c2 = new DataHolder();
		c2.setName("+994792718 Ragul");
		c2.setTime("10/08/1994 12.00pm 0.55h");
		vReport.add(c2);
		DataHolder c3 = new DataHolder();
		c3.setName("+9994894568 Ramesh");
		c3.setTime("11/07/1994 12.00pm 0.53h");
		vReport.add(c3);
		DataHolder c4 = new DataHolder();
		c4.setName("+9994792608 Raghav");
		c4.setTime("11/09/1993 12.00pm 0.53h");
		vReport.add(c4);
		DataHolder c5 = new DataHolder();
		c5.setName("+9994745458 Vignesh");
		c5.setTime("11/08/1993 12.00pm 0.53h");
		vReport.add(c5);
		DataHolder c6 = new DataHolder();
		c6.setName("+994792718 Ragul");
		c6.setTime("10/08/1993 12.00pm 0.55h");
		vReport.add(c6);
		DataHolder c7= new DataHolder();
		c7.setName("+9994894568 Ramesh");
		c7.setTime("11/07/1993 12.00pm 0.53h");
		vReport.add(c7);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dialed, menu);
		return true;
	}

}
